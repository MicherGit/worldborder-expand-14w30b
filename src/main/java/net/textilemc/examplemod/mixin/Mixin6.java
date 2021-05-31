package net.textilemc.examplemod.mixin;

import net.minecraft.*;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(class_2226.class)
public abstract class Mixin6 {
    @Shadow
    private static final Logger field_7577 = null;
    public final class_1983 field_7575;
    private final MinecraftServer field_7578;
    public class_2213 field_7576;
    private int field_7579;
    private int field_7580;
    private int field_7581;
    private boolean field_7582;
    private int field_7583;
    private long field_7584;
    private long field_7585;
    private int field_7586;
    private int field_7587;
    private class_2283 field_7588;
    private double field_7589;
    private double field_7590;
    private double field_7591;
    private boolean field_7592;
    public Mixin6(class_1983 field_7575, MinecraftServer field_7578, int field_7579, int field_7583, long field_7584, long field_7585, int field_7586, int field_7587, class_2283 field_7588) {
        this.field_7575 = field_7575;
        this.field_7578 = field_7578;
        this.field_7579 = field_7579;
        this.field_7583 = field_7583;
        this.field_7584 = field_7584;
        this.field_7585 = field_7585;
        this.field_7586 = field_7586;
        this.field_7587 = field_7587;
        this.field_7588 = field_7588;
    }
    @Shadow
    public abstract void method_6974(final double d, final double e, final double f, final float g, final float h);
    /**
     * @author
     */
    @Overwrite
    public void method_6541(final class_2129 arg) {
        class_2023.method_6099(arg, (class_2226)(Object)this, this.field_7576.method_6928());
        final class_2210 method_6685 = this.field_7578.method_6685(this.field_7576.field_8020);
        this.field_7582 = true;
        if (this.field_7576.field_7518) {
            return;
        }
        final double field_8046 = this.field_7576.field_8046;
        final double field_8047 = this.field_7576.field_8047;
        final double field_8048 = this.field_7576.field_8048;
        if (!this.field_7592) {
            final double field_8049 = arg.method_6586() - this.field_7589;
            final double n = arg.method_6589() - this.field_7590;
            final double n2 = arg.method_6590() - this.field_7591;
            if (field_8049 * field_8049 + n * n + n2 * n2 < 0.25) {
                this.field_7592 = true;
            }
        }
        if (this.field_7592) {
            this.field_7580 = this.field_7579;
            if (this.field_7576.field_8040 != null) {
                float g = this.field_7576.field_8052;
                float h = this.field_7576.field_8053;
                this.field_7576.field_8040.method_7552();
                final double n = this.field_7576.field_8046;
                final double n2 = this.field_7576.field_8047;
                final double n3 = this.field_7576.field_8048;
                if (arg.method_6595()) {
                    g = arg.method_6591();
                    h = arg.method_6592();
                }
                this.field_7576.field_7984 = arg.method_6593();
                this.field_7576.method_6923();
                this.field_7576.method_7501(n, n2, n3, g, h);
                if (this.field_7576.field_8040 != null) {
                    this.field_7576.field_8040.method_7552();
                }
                this.field_7578.method_6718().method_7054(this.field_7576);
                if (this.field_7592) {
                    this.field_7589 = this.field_7576.field_8046;
                    this.field_7590 = this.field_7576.field_8047;
                    this.field_7591 = this.field_7576.field_8048;
                }
                method_6685.method_1416(this.field_7576);
                return;
            }
            if (this.field_7576.method_7704()) {
                this.field_7576.method_6923();
                this.field_7576.method_7501(this.field_7589, this.field_7590, this.field_7591, this.field_7576.field_8052, this.field_7576.field_8053);
                method_6685.method_1416(this.field_7576);
                return;
            }
            final double field_8049 = this.field_7576.field_8047;
            this.field_7589 = this.field_7576.field_8046;
            this.field_7590 = this.field_7576.field_8047;
            this.field_7591 = this.field_7576.field_8048;
            double n = this.field_7576.field_8046;
            double n2 = this.field_7576.field_8047;
            double n3 = this.field_7576.field_8048;
            float g2 = this.field_7576.field_8052;
            float h2 = this.field_7576.field_8053;
            if (arg.method_6594() && arg.method_6589() == -999.0) {
                arg.method_6588(false);
            }
            if (arg.method_6594()) {
                n = arg.method_6586();
                n2 = arg.method_6589();
                n3 = arg.method_6590();
                if (Math.abs(arg.method_6586()) > Integer.MAX_VALUE || Math.abs(arg.method_6590()) > Integer.MAX_VALUE) {
                    this.method_6977("Illegal position");
                    return;
                }
            }
            if (arg.method_6595()) {
                g2 = arg.method_6591();
                h2 = arg.method_6592();
            }
            this.field_7576.method_6923();
            this.field_7576.method_7501(this.field_7589, this.field_7590, this.field_7591, g2, h2);
            if (!this.field_7592) {
                return;
            }
            double d = n - this.field_7576.field_8046;
            double e = n2 - this.field_7576.field_8047;
            double f = n3 - this.field_7576.field_8048;
            final double min = Math.min(Math.abs(d), Math.abs(this.field_7576.field_8049));
            final double min2 = Math.min(Math.abs(e), Math.abs(this.field_7576.field_8050));
            final double min3 = Math.min(Math.abs(f), Math.abs(this.field_7576.field_8051));
            double n4 = min * min + min2 * min2 + min3 * min3;
            if (n4 > 100.0 && (!this.field_7578.method_6677() || !this.field_7578.method_6676().equals(this.field_7576.method_441()))) {
                this.field_7577.warn(this.field_7576.method_441() + " moved too quickly! " + d + "," + e + "," + f + " (" + min + ", " + min2 + ", " + min3 + ")");
                this.method_6974(this.field_7589, this.field_7590, this.field_7591, this.field_7576.field_8052, this.field_7576.field_8053);
                return;
            }
            final float n5 = 0.0625f;
            final boolean empty = method_6685.method_1345(this.field_7576, this.field_7576.method_7540().method_3049(n5, n5, n5)).isEmpty();
            if (this.field_7576.field_7984 && !arg.method_6593() && e > 0.0) {
                this.field_7576.method_7734();
            }
            this.field_7576.method_7590(d, e, f);
            this.field_7576.field_7984 = arg.method_6593();
            final double n6 = e;
            d = n - this.field_7576.field_8046;
            e = n2 - this.field_7576.field_8047;
            if (e > -0.5 || e < 0.5) {
                e = 0.0;
            }
            f = n3 - this.field_7576.field_8048;
            n4 = d * d + e * e + f * f;
            boolean b = false;
            if (n4 > 0.0625 && !this.field_7576.method_7704() && !this.field_7576.field_7512.method_6945()) {
                b = true;
                this.field_7577.warn(this.field_7576.method_441() + " moved wrongly!");
            }
            this.field_7576.method_7501(n, n2, n3, g2, h2);
            this.field_7576.method_654(this.field_7576.field_8046 - field_8046, this.field_7576.field_8047 - field_8047, this.field_7576.field_8048 - field_8048);
            if (!this.field_7576.field_8001) {
                final boolean empty2 = method_6685.method_1345(this.field_7576, this.field_7576.method_7540().method_3049(n5, n5, n5)).isEmpty();
                if (empty && (b || !empty2) && !this.field_7576.method_7704()) {
                    this.method_6974(this.field_7589, this.field_7590, this.field_7591, g2, h2);
                    return;
                }
            }
            final class_1046 method_6686 = this.field_7576.method_7540().method_3042(n5, n5, n5).method_3036(0.0, -0.55, 0.0);
            if (!this.field_7578.method_6714() && !this.field_7576.field_558.field_516 && !method_6685.method_1390(method_6686)) {
                if (n6 >= -0.03125) {
                    ++this.field_7581;
                    if (this.field_7581 > 80) {
                        this.field_7577.warn(this.field_7576.method_441() + " was kicked for floating too long!");
                        this.method_6977("Flying is not enabled on this server");
                        return;
                    }
                }
            }
            else {
                this.field_7581 = 0;
            }
            this.field_7576.field_7984 = arg.method_6593();
            this.field_7578.method_6718().method_7054(this.field_7576);
            this.field_7576.method_6911(this.field_7576.field_8047 - field_8049, arg.method_6593());
        }
        else if (this.field_7579 - this.field_7580 > 20) {
            this.method_6974(this.field_7589, this.field_7590, this.field_7591, this.field_7576.field_8052, this.field_7576.field_8053);
        }
    }
    @Shadow
    public abstract void method_6977(final String string);
}
