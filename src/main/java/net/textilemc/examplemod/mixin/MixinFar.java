package net.textilemc.examplemod.mixin;

import net.minecraft.class_2292;
import net.minecraft.class_968;
import net.minecraft.class_969;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(class_969.class)
public class MixinFar {
    // Farlands mixin with jank intermediaries
    @Shadow
    private class_968[] field_3129;
    @Shadow
    private int field_3130;
    /**
     * @author
     */
    @Overwrite
    public double[] method_2770(double[] ds, int i, int j, int k, int l, int m, int n, double d, double e, double f) {
        if (ds == null) {
            ds = new double[l * m * n];
        } else {
            for(int var14 = 0; var14 < ds.length; ++var14) {
                ds[var14] = 0.0D;
            }
        }

        double var27 = 1.0D;

        for(int var16 = 0; var16 < this.field_3130; ++var16) {
            double var17 = (double)i * var27 * d;
            double var19 = (double)j * var27 * e;
            double var21 = (double)k * var27 * f;
            //long var23 = class_2292.method_7277(var17);
            //long var25 = class_2292.method_7277(var21);
            //var17 -= (double)var23;
            //var21 -= (double)var25;
            //var23 %= 16777216L;
            //var25 %= 16777216L;
            //var17 += (double)var23;
            //var21 += (double)var25;
            this.field_3129[var16].method_2767(ds, var17, var19, var21, l, m, n, d * var27, e * var27, f * var27, var27);
            var27 /= 2.0D;
        }

        return ds;
    }
}
