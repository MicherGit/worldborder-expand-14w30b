package net.textilemc.examplemod.mixin;

import com.google.common.collect.Lists;
import net.minecraft.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.ArrayList;
import java.util.List;

@Mixin(class_393.class)
public abstract class Mixin1 {

    @Shadow
    public abstract class_736 method_1492(class_1912 arg);
    /**
     * @author
     */
    @Overwrite
    private boolean method_1311(class_1912 arg) {
        return arg.method_5841() >= -2147483647 && arg.method_5843() >= -2147483647 && arg.method_5841() < 2147483647 && arg.method_5843() < 2147483647 && arg.method_5842() >= 0 && arg.method_5842() < 256;
    }
    @Shadow
    public boolean method_1405(class_1912 arg) {
        return this.method_1325(arg, true);
    }
    @Shadow
    public boolean method_1325(class_1912 arg, boolean bl) {
        return !this.method_1311(arg) ? false : this.method_1282(arg.method_5841() >> 4, arg.method_5843() >> 4, bl);
    }
    /**
     * @author
     */
    @Overwrite
    public int method_1395(class_1912 arg, boolean bl) {
        if (arg.method_5841() >= -2147483647 && arg.method_5843() >= -2147483647 && arg.method_5841() < 2147483647 && arg.method_5843() < 2147483647) {
            if (bl && this.method_1492(arg).method_2212().method_1741()) {
                int var8 = this.method_1395(arg.method_5732(), false);
                int var4 = this.method_1395(arg.method_5752(), false);
                int var5 = this.method_1395(arg.method_5750(), false);
                int var6 = this.method_1395(arg.method_5748(), false);
                int var7 = this.method_1395(arg.method_5745(), false);
                if (var4 > var8) {
                    var8 = var4;
                }

                if (var5 > var8) {
                    var8 = var5;
                }

                if (var6 > var8) {
                    var8 = var6;
                }

                if (var7 > var8) {
                    var8 = var7;
                }

                return var8;
            } else if (arg.method_5842() < 0) {
                return 0;
            } else {
                if (arg.method_5842() >= 256) {
                    arg = new class_1912(arg.method_5841(), 255, arg.method_5843());
                }

                class_762 var3 = this.method_1410(arg);
                return var3.method_2329(arg, this.field_1284);
            }
        } else {
            return 15;
        }
    }
    @Shadow
    public class_762 method_1277(int i, int j) {
        return this.field_1302.method_2312(i, j);
    }
    @Shadow
    public class_762 method_1410(class_1912 arg) {
        return this.method_1277(arg.method_5841() >> 4, arg.method_5843() >> 4);
    }
    @Shadow
    protected class_759 field_1302;
    @Shadow
    private int field_1284;
    @Shadow
    protected boolean method_1282(int i, int j, boolean bl) {
        return this.field_1302.method_2302(i, j) && (bl || !this.field_1302.method_2312(i, j).method_2365());
    }
    /**
     * @author
     */
    @Overwrite
    public List method_1303(class_1046 arg) {
        ArrayList var2 = Lists.newArrayList();
        int var3 = class_2292.method_7272(arg.field_3373);
        int var4 = class_2292.method_7272(arg.field_3376 + 1.0D);
        int var5 = class_2292.method_7272(arg.field_3374);
        int var6 = class_2292.method_7272(arg.field_3377 + 1.0D);
        int var7 = class_2292.method_7272(arg.field_3375);
        int var8 = class_2292.method_7272(arg.field_3378 + 1.0D);

        for(int var9 = var3; var9 < var4; ++var9) {
            for(int var10 = var7; var10 < var8; ++var10) {
                if (this.method_1405(new class_1912(var9, 64, var10))) {
                    for(int var11 = var5 - 1; var11 < var6; ++var11) {
                        class_1912 var13 = new class_1912(var9, var11, var10);
                        class_736 var12;
                        if (var9 >= -2147483647 && var9 < 2147483647 && var10 >= -2147483647 && var10 < 2147483647) {
                            var12 = this.method_1492(var13);
                        } else {
                            var12 = class_473.BEDROCK.method_1638();
                        }

                        var12.method_2212().method_1665((class_393)(Object)this , var13, var12, arg, var2, (class_2334)null);
                    }
                }
            }
        }

        return var2;
    }
    /**
     * @author
     */
    @Overwrite
    public int method_1363(int i, int j) {
        if (i >= -2147483647 && j >= -2147483647 && i < 2147483647 && j < 2147483647) {
            if (!this.method_1282(i >> 4, j >> 4, true)) {
                return 0;
            } else {
                class_762 var3 = this.method_1277(i >> 4, j >> 4);
                return var3.method_2390();
            }
        } else {
            return 64;
        }
    }
    /**
     * @author
     */
    @Overwrite
    public class_1912 method_1430(class_1912 arg) {
        int var2;
        if (arg.method_5841() >= -2147483647 && arg.method_5843() >= -2147483647 && arg.method_5841() < 2147483647 && arg.method_5843() < 2147483647) {
            if (this.method_1282(arg.method_5841() >> 4, arg.method_5843() >> 4, true)) {
                var2 = this.method_1277(arg.method_5841() >> 4, arg.method_5843() >> 4).method_2344(arg.method_5841() & 15, arg.method_5843() & 15);
            } else {
                var2 = 0;
            }
        } else {
            var2 = 64;
        }

        return new class_1912(arg.method_5841(), var2, arg.method_5843());
    }


}
