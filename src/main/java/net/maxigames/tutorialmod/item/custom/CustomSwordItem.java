package net.maxigames.tutorialmod.item.custom;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import org.jetbrains.annotations.NotNull;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class CustomSwordItem extends SwordItem {
    public CustomSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }


    public CustomSwordItem(Properties durability) {
        super(Tiers.NETHERITE,9,1,new Properties()
                );
    }
}
