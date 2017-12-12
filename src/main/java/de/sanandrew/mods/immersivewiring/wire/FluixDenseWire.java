package de.sanandrew.mods.immersivewiring.wire;

import blusunrize.immersiveengineering.api.energy.wires.ImmersiveNetHandler;
import de.sanandrew.mods.immersivewiring.item.ItemRegistry;
import net.minecraft.item.ItemStack;

public class FluixDenseWire
        extends FluixWire
{
    @Override
    public String getUniqueName() {
        return "DENSE";
    }

    @Override
    public int getMaxLength() {
        return 32;//TODO: add ImmersiveIntegration.cfg.denseWireRange;
    }

    @Override
    public int getColour(ImmersiveNetHandler.Connection connection) {
        return 0x5C1682;
    }

    @Override
    public ItemStack getWireCoil() {
        return new ItemStack(ItemRegistry.WIRE_COIL, 1, WireRegistry.Wire.FLUIX_DENSE.ordinal());
    }

    @Override
    public double getRenderDiameter() {
        return 0.1f;
    }

    @Override
    public double getSlack() {
        return 1.008;
    }
}