package net.minecraft.src;

import net.minecraft.src.Enchantment;
import net.minecraft.src.EnumEnchantmentType;

public class EnchantmentOxygen extends Enchantment {

   public EnchantmentOxygen(int p_i532_1_, int p_i532_2_) {
      super(p_i532_1_, p_i532_2_, EnumEnchantmentType.armor_head);
      this.func_40494_a("oxygen");
   }

   public int func_40492_a(int p_40492_1_) {
      return 10 * p_40492_1_;
   }

   public int func_40489_b(int p_40489_1_) {
      return this.func_40492_a(p_40489_1_) + 30;
   }

   public int func_40491_a() {
      return 3;
   }
}
