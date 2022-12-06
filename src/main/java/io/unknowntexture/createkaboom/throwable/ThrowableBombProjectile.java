package io.unknowntexture.createkaboom.throwable;

import io.unknowntexture.createkaboom.item.ModItems;
import net.minecraft.client.particle.Particle;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.TntBlock;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

import javax.annotation.Nullable;

public class ThrowableBombProjectile extends ThrowableItemProjectile {


    public ThrowableBombProjectile(EntityType<? extends ThrowableItemProjectile> p_37442_, Level p_37443_) {
        super(p_37442_, p_37443_);
    }

    @Override
    protected Item getDefaultItem() {
        //If it doesn't work, try: ModItems.IRON_BOMB.get();
        return null;
    }


    public ThrowableBombProjectile(Level level, LivingEntity livingEntity) {
        super(EntityType.SNOWBALL, livingEntity, level);
    }

    private ParticleOptions getParticle() {
        ItemStack itemstack = this.getItemRaw();
        return (ParticleOptions)(itemstack.isEmpty() ? ParticleTypes.ITEM_SNOWBALL : new ItemParticleOption(ParticleTypes.ITEM, itemstack));
    }

    public void handleEntityEvent(byte b) {
        if (b == 3) {
            ParticleOptions particleoptions = this.getParticle();

            for(int i = 0; i < 8; ++i) {
                this.level.addParticle(particleoptions, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
            }
        }

    }

    protected void onHitEntity(EntityHitResult hitResult) {
        throwableBombExplode();
    }

    @Override
    protected void onHitBlock(BlockHitResult p_37258_) {
        super.onHitBlock(p_37258_);
        throwableBombExplode();

    }

    protected void throwableBombExplode() {
        float f = 2.0F;
        //IDK is this radius or damage
        this.level.explode(this, this.getX(), this.getY(0.0625D), this.getZ(), f, Explosion.BlockInteraction.NONE);
    }
}
