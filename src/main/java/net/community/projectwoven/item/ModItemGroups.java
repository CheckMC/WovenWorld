package net.community.projectwoven.item;

import net.community.projectwoven.WovenWorld;
import net.community.projectwoven.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MOD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(WovenWorld.MOD_ID, "modblocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modblocks"))
                    .icon(() -> new ItemStack(ModBlocks.REDWOOD_PLANKS)).entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.REDWOOD_PLANKS);
                    })).build());

    public static void registerItemGroups() {
        WovenWorld.LOGGER.info("Registering Item Groups for " + WovenWorld.MOD_ID);
    }

}
