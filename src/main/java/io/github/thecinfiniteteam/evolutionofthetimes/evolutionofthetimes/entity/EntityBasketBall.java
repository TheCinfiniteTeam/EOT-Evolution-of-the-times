package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.entity;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityBasketBall extends Entity {
    public EntityBasketBall(World worldIn)
    {
        super(worldIn);
        this.setSize(0.98F, 0.98F);
    }
    public EntityBasketBall(World worldIn, double x, double y, double z) {
        this(worldIn);
        this.setPosition(x, y, z);
    }
    protected void entityInit(){ }
    public void onUpdate(){ }
    protected void readEntityFromNBT(NBTTagCompound compound) {

    }
    protected void writeEntityToNBT(NBTTagCompound compound) {

    }
}
