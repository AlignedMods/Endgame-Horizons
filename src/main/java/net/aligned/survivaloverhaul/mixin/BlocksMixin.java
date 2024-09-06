package net.aligned.survivaloverhaul.mixin;

import net.minecraft.block.*;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(Blocks.class)
public abstract class BlocksMixin {
    @ModifyConstant(method = "<clinit>")
    private static float ModifyStone(float constant) {
        // Stone has a hardness of 1.5 so it will set that value to 7.0 (this does also modify some other blocks (such as pistons))
        return constant == 1.5F ? 7.0F : constant;

    }
}