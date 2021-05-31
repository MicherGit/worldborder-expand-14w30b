package net.textilemc.examplemod.mixin;

import net.minecraft.class_1907;
import net.minecraft.class_2;
import net.minecraft.class_2399;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(class_2399.class)
public class Mixin2 {
    @Overwrite
    public static double method_7981(double d, String string, boolean bl) {
        return method_7980(d, string, -2147483647, 2147483647, bl);
    }
    @Overwrite
    public static class_2 method_7959(double d, String string, boolean bl) {
        return method_7958(d, string, -2147483647, 2147483647, bl);
    }

    @Shadow
    public static class_2 method_7958(double d, String string, int i, int j, boolean bl) {
        return null;
    }

    @Shadow
    public static double method_7980(double d, String string, int i, int j, boolean bl) {
        return 0;
    }
}
