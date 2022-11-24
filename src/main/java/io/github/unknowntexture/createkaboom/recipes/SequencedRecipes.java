package java.io.github.unkowntexture.createkaboom.recipes
  {
  "type": "create:sequenced_assembly",
  "ingredient": {
    "item": "createKaboom:glass_shell"
  },
  "loops": 6,
  "results": [
    {
      "item": "create:glass_bomb"
    }
  ],
  "sequence": [
    {
      "type": "create:filling",
      "ingredients": [
        {
          "item": "createkaboom:incomplete_glass_bomb"
        },
        {
          "amount": 250,
          "fluid": "minecraft:lava",
          "nbt": {}
        }
      ],
      "results": [
        {
          "item": "create:incomplete_glass_bomb"
        }
      ]
    }
