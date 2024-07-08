package de.conghg.glitzorium.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class adminSword {
    public static ItemStack get(){
        ItemStack item = new ItemStack(Material.WOODEN_SWORD);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "OP Admin Sword");
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addEnchant(Enchantment.DAMAGE_ALL,1000,true);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.attackDamage", 1000, AttributeModifier.Operation.ADD_NUMBER));
        ArrayList<String> lore = new ArrayList<>();
        lore.add("Das ist das mächtigste Item auf dem Server");
        lore.add("Wenn du dies hast kannst\n du alles easy töten");
        meta.setLore(lore);


        item.setItemMeta(meta);
        return item;
    }
}
