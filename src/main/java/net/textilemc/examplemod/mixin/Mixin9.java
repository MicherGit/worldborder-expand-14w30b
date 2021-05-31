package net.textilemc.examplemod.mixin;

import net.minecraft.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value = class_424.class, priority = 999)
public abstract class Mixin9 {
    @Shadow public boolean field_1485;
    @Shadow protected class_393 field_1486;
    @Shadow protected Random field_1487;
    @Shadow protected class_1912 field_1488;
    @Shadow protected class_785 field_1489;
    @Shadow protected class_810 field_1490 = new class_806(4);
    @Shadow protected class_810 field_1491;
    @Shadow protected class_810 field_1492;
    @Shadow protected class_810 field_1493;
    @Shadow protected class_810 field_1494;
    @Shadow protected class_810 field_1495;
    @Shadow protected class_810 field_1496;
    @Shadow protected class_810 field_1497;
    @Shadow protected class_810 field_1498;
    @Shadow protected class_810 field_1499;
    @Shadow protected class_810 field_1500;
    @Shadow protected class_810 field_1501;
    @Shadow protected class_810 field_1502;
    @Shadow protected class_810 field_1503;
    @Shadow protected class_811 field_1504;
    @Shadow protected class_810 field_1505;
    @Shadow protected class_810 field_1506;
    @Shadow protected class_810 field_1507;
    @Shadow protected class_810 field_1508;
    @Shadow protected class_810 field_1509;
    @Shadow protected class_810 field_1510;
    @Shadow protected int field_1511;
    @Shadow protected int field_1474;
    @Shadow protected int field_1475;
    @Shadow protected int field_1476;
    @Shadow protected int field_1477;
    @Shadow protected int field_1478;
    @Shadow protected int field_1479;
    @Shadow protected int field_1480;
    @Shadow protected int field_1481;
    @Shadow protected int field_1482;
    @Shadow protected int field_1483;
    @Shadow protected int field_1484;
    @Inject(method = "<init>", at = @At("RETURN"))
    private void fixConstructor(CallbackInfo ci) {
        //this.field_1485 = false;
    }
    @Shadow
    protected abstract void method_1573(class_412 arg);

    /**
     * @author
     */
    @Overwrite
    public void method_1572(class_393 arg, Random random, class_412 arg2, class_1912 arg3) {
        if (this.field_1486 != null) {
            this.field_1486 = arg;
            String var5 = arg.method_1261().method_2894();
            if (var5 != null) {
                this.field_1489 = class_787.method_2478(var5).method_2479();
            } else {
                this.field_1489 = class_787.method_2478("").method_2479();
            }

            this.field_1487 = random;
            this.field_1488 = arg3;
            this.field_1493 = new class_826(class_473.DIRT.method_1638(), this.field_1489.field_2635);
            this.field_1494 = new class_826(class_473.GRAVEL.method_1638(), this.field_1489.field_2639);
            this.field_1495 = new class_826(class_473.STONE.method_1638().method_2209(class_656.field_2198, class_657.GRANITE), this.field_1489.field_2643);
            this.field_1496 = new class_826(class_473.STONE.method_1638().method_2209(class_656.field_2198, class_657.DIORITE), this.field_1489.field_2647);
            this.field_1497 = new class_826(class_473.STONE.method_1638().method_2209(class_656.field_2198, class_657.ANDESITE), this.field_1489.field_2651);
            this.field_1498 = new class_826(class_473.COAL_ORE.method_1638(), this.field_1489.field_2656);
            this.field_1499 = new class_826(class_473.IRON_ORE.method_1638(), this.field_1489.field_2660);
            this.field_1500 = new class_826(class_473.GOLD_ORE.method_1638(), this.field_1489.field_2664);
            this.field_1501 = new class_826(class_473.REDSTONE_ORE.method_1638(), this.field_1489.field_2668);
            this.field_1502 = new class_826(class_473.DIAMOND_ORE.method_1638(), this.field_1489.field_2672);
            this.field_1503 = new class_826(class_473.LAPIS_ORE.method_1638(), this.field_1489.field_2676);
            this.method_1573(arg2);
            this.field_1486 = null;
            this.field_1487 = null;
        } else {
            this.field_1486 = arg;
            String var5 = arg.method_1261().method_2894();
            if (var5 != null) {
                this.field_1489 = class_787.method_2478(var5).method_2479();
            } else {
                this.field_1489 = class_787.method_2478("").method_2479();
            }

            this.field_1487 = random;
            this.field_1488 = arg3;
            this.field_1493 = new class_826(class_473.DIRT.method_1638(), this.field_1489.field_2635);
            this.field_1494 = new class_826(class_473.GRAVEL.method_1638(), this.field_1489.field_2639);
            this.field_1495 = new class_826(class_473.STONE.method_1638().method_2209(class_656.field_2198, class_657.GRANITE), this.field_1489.field_2643);
            this.field_1496 = new class_826(class_473.STONE.method_1638().method_2209(class_656.field_2198, class_657.DIORITE), this.field_1489.field_2647);
            this.field_1497 = new class_826(class_473.STONE.method_1638().method_2209(class_656.field_2198, class_657.ANDESITE), this.field_1489.field_2651);
            this.field_1498 = new class_826(class_473.COAL_ORE.method_1638(), this.field_1489.field_2656);
            this.field_1499 = new class_826(class_473.IRON_ORE.method_1638(), this.field_1489.field_2660);
            this.field_1500 = new class_826(class_473.GOLD_ORE.method_1638(), this.field_1489.field_2664);
            this.field_1501 = new class_826(class_473.REDSTONE_ORE.method_1638(), this.field_1489.field_2668);
            this.field_1502 = new class_826(class_473.DIAMOND_ORE.method_1638(), this.field_1489.field_2672);
            this.field_1503 = new class_826(class_473.LAPIS_ORE.method_1638(), this.field_1489.field_2676);
            this.method_1573(arg2);
            this.field_1486 = null;
            this.field_1487 = null;
        }
    }

}
