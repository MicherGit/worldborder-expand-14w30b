package net.textilemc.examplemod.mixin;

import net.minecraft.class_758;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(class_758.class)
public class Mixin4 {
    @Shadow
    private double field_2528;
    @Shadow
    private int field_2532;

    @Inject(method = "<init>", at = @At("RETURN"))
    private void fixConstructor(CallbackInfo ci) {
        this.field_2532 = Integer.MAX_VALUE;
        // Default worldborder size
        this.field_2528 = 4294967294.0D;
    }
}
