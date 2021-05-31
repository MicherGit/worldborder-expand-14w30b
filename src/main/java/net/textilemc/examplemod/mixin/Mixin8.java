package net.textilemc.examplemod.mixin;

import net.minecraft.*;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(class_1904.class)
public abstract class Mixin8 extends class_2399 {

    @Shadow
    protected class_758 method_5730() {
        return MinecraftServer.method_6673().field_7366[0].method_1358();
    }
    /**
     * @author
     */
    @Overwrite
    public void method_264(class_95 arg, String[] strings) {
        if (strings.length < 1) {
             new class_1911("commands.worldborder.usage", new Object[0]);
        } else {
            class_758 var3 = this.method_5730();
            double var4;
            double var6;
            int var8;
            if (strings[0].equals("set")) {
                if (strings.length != 2 && strings.length != 3) {
                     new class_1911("commands.worldborder.set.usage", new Object[0]);
                }

                var4 = var3.method_2294();
                var6 = method_7969(strings[1], 1.0D, 4294967294D);
                var8 = strings.length > 2 ? method_7970(strings[2], 0) * 1000 : 0;
                if (var8 > 0) {
                    var3.method_2273(var4, var6, var8);
                    if (var4 > var6) {
                        method_7962(arg, this, "commands.worldborder.setSlowly.shrink.success", new Object[]{String.format("%.1f", var6), String.format("%.1f", var4), class_2292.method_7278((float)(var8 / 1000))});
                    } else {
                        method_7962(arg, this, "commands.worldborder.setSlowly.grow.success", new Object[]{String.format("%.1f", var6), String.format("%.1f", var4), class_2292.method_7278((float)(var8 / 1000))});
                    }
                } else {
                    var3.method_2272(var6);
                    method_7962(arg, this, "commands.worldborder.set.success", new Object[]{String.format("%.1f", var6), String.format("%.1f", var4)});
                }
            } else if (strings[0].equals("add")) {
                if (strings.length != 2 && strings.length != 3) {
                     new class_1911("commands.worldborder.add.usage", new Object[0]);
                }

                var4 = var3.method_2292();
                var6 = var4 + method_7969(strings[1], -var4, 4294967294D - var4);
                var8 = var3.method_2293() + (strings.length > 2 ? method_7970(strings[2], 0) * 1000 : 0);
                if (var8 > 0) {
                    var3.method_2273(var4, var6, var8);
                    if (var4 > var6) {
                        method_7962(arg, this, "commands.worldborder.setSlowly.shrink.success", new Object[]{String.format("%.1f", var6), String.format("%.1f", var4), class_2292.method_7278((float)(var8 / 1000))});
                    } else {
                        method_7962(arg, this, "commands.worldborder.setSlowly.grow.success", new Object[]{String.format("%.1f", var6), String.format("%.1f", var4), class_2292.method_7278((float)(var8 / 1000))});
                    }
                } else {
                    var3.method_2272(var6);
                    method_7962(arg, this, "commands.worldborder.set.success", new Object[]{String.format("%.1f", var6), String.format("%.1f", var4)});
                }
            } else if (strings[0].equals("center")) {
                if (strings.length != 3) {
                     new class_1911("commands.worldborder.center.usage", new Object[0]);
                }

                class_1912 var9 = arg.method_439();
                double var5 = method_7981((double)var9.method_5841() + 0.5D, strings[1], true);
                double var7 = method_7981((double)var9.method_5843() + 0.5D, strings[2], true);
                var3.method_2286(var5, var7);
                method_7962(arg, this, "commands.worldborder.center.success", new Object[]{var5, var7});
            } else if (strings[0].equals("damage")) {
                if (strings.length < 2) {
                     new class_1911("commands.worldborder.damage.usage", new Object[0]);
                }

                if (strings[1].equals("buffer")) {
                    if (strings.length != 3) {
                         new class_1911("commands.worldborder.damage.buffer.usage", new Object[0]);
                    }

                    var4 = method_7968(strings[2], 0.0D);
                    var6 = var3.method_2297();
                    var3.method_2281(var4);
                    method_7962(arg, this, "commands.worldborder.damage.buffer.success", new Object[]{String.format("%.1f", var4), String.format("%.1f", var6)});
                } else if (strings[1].equals("amount")) {
                    if (strings.length != 3) {
                         new class_1911("commands.worldborder.damage.amount.usage", new Object[0]);
                    }

                    var4 = method_7968(strings[2], 0.0D);
                    var6 = var3.method_2298();
                    var3.method_2285(var4);
                    method_7962(arg, this, "commands.worldborder.damage.amount.success", new Object[]{String.format("%.2f", var4), String.format("%.2f", var6)});
                }
            } else if (strings[0].equals("warning")) {
                if (strings.length < 2) {
                     new class_1911("commands.worldborder.warning.usage", new Object[0]);
                }

                int var11 = method_7970(strings[2], 0);
                int var10;
                if (strings[1].equals("time")) {
                    if (strings.length != 3) {
                         new class_1911("commands.worldborder.warning.time.usage", new Object[0]);
                    }

                    var10 = var3.method_2300();
                    var3.method_2283(var11);
                    method_7962(arg, this, "commands.worldborder.warning.time.success", new Object[]{var11, var10});
                } else if (strings[1].equals("distance")) {
                    if (strings.length != 3) {
                         new class_1911("commands.worldborder.warning.distance.usage", new Object[0]);
                    }

                    var10 = var3.method_2301();
                    var3.method_2287(var11);
                    method_7962(arg, this, "commands.worldborder.warning.distance.success", new Object[]{var11, var10});
                }
            } else if (strings[0].equals("get")) {
                var4 = var3.method_2292();
                arg.method_437(class_148.QUERY_RESULT, class_2292.method_7272(var4 + 0.5D));
                arg.method_438(new class_2018("commands.worldborder.get.success", new Object[]{String.format("%.0f", var4)}));
            }

        }
    }
    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}
