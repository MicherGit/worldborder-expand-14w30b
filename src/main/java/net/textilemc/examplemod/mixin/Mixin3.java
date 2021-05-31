package net.textilemc.examplemod.mixin;

import net.minecraft.class_1912;
import net.minecraft.class_2292;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(class_1912.class)
public class Mixin3 {
    @Shadow
    private static int field_6639;
    @Inject(method = "<init>", at = @At("RETURN"))
    private void fixRange(CallbackInfo ci) {
        field_6639 = 1 + class_2292.method_7274(class_2292.method_7269(Integer.MAX_VALUE));
    }
}
