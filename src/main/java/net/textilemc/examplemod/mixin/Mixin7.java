package net.textilemc.examplemod.mixin;

import net.minecraft.class_1025;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(class_1025.class)
public class Mixin7 {
    @Shadow
    private double field_3313;

    @Inject(method = "<init>()V", at = @At("RETURN"))
    private void fixAgain(CallbackInfo ci) {
        field_3313 = 4294967294.0D;
    }
    //@Inject(method = "<init>", at = @At("RETURN"))
    //private void fixAgain(CallbackInfo ci) {
    //    field_3313 = Integer.MAX_VALUE * 2.0D;
    //}
    @Inject(method = "<init>(Lnet/minecraft/class_1953;)V", at = @At("RETURN"))
    private void fixAgain2(CallbackInfo ci) {
        field_3313 = 4294967294.0D;
    }
    @Inject(method = "<init>(Lnet/minecraft/class_401;Ljava/lang/String;)V", at = @At("RETURN"))
    private void fixAgain3(CallbackInfo ci) {
        field_3313 = 4294967294.0D;
    }
    @Inject(method = "<init>(Lnet/minecraft/class_1025;)V", at = @At("RETURN"))
    private void fixAgain4(CallbackInfo ci) {
        field_3313 = 4294967294.0D;
    }
}
