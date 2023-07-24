package net.maxigames.tutorialmod.item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import javax.xml.transform.Result;

public class CustomSwordItem extends SwordItem {
    public CustomSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, 8, 20, pProperties);
    }



}
