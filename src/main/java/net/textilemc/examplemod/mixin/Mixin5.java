package net.textilemc.examplemod.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MinecraftServer.class)
public class Mixin5 {
    /**
     * @author
     */
    @Overwrite
    public int method_6705() {
        return Integer.MAX_VALUE;
    }
}
