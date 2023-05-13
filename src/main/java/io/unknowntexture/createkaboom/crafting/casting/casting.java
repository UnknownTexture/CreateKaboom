package io.unknowntexture.createkaboom.crafting.casting;
import com.simibubi.create.Create;
import com.simibubi.create.api.behaviour.BlockSpoutingBehaviour;
import net.minecraft.resources.ResourceLocation;

import com.simibubi.create.content.contraptions.fluids.actors.SpoutTileEntity;
import com.simibubi.create.foundation.fluid.FluidHelper;
import com.simibubi.create.foundation.utility.RegisteredObjects;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler.FluidAction;

public class casting extends BlockSpoutingBehaviour {

    @Override
    public int fillBlock(Level level, BlockPos pos, SpoutTileEntity spout, FluidStack availableFluid,
                         boolean simulate) {

        BlockEntity te = level.getBlockEntity(pos);
        if (te == null)
            return 0;

        IFluidHandler handler = te.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, Direction.UP)
                .orElse(null);
        if (handler == null)
            return 0;
        if (handler.getTanks() != 1)
            return 0;

        FluidStack containedFluid = handler.getFluidInTank(0);
        if (!(containedFluid.isEmpty() || containedFluid.isFluidEqual(availableFluid)))
            return 0;

        int amount = availableFluid.getAmount();
        if (amount < 1000
                && handler.fill(FluidHelper.copyStackWithAmount(availableFluid, amount + 1), FluidAction.SIMULATE) > amount)
            return 0;

        return handler.fill(availableFluid, simulate ? FluidAction.SIMULATE : FluidAction.EXECUTE);
        }

    }
