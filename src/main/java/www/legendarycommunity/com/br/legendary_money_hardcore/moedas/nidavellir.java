package www.legendarycommunity.com.br.legendary_money_hardcore.moedas;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getLogger;

public class nidavellir implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("banknidavellir")) {

            if (args.length == 0) {
                sender.sendMessage(ChatColor.RED + "Use correto: /banknidavellir <nome_do_jogador>");
                return true;
            }

            Player targetPlayer = Bukkit.getPlayer(args[0]);

            if (targetPlayer == null || !targetPlayer.isOnline()) {
                sender.sendMessage(ChatColor.RED + "Jogador não encontrado ou offline.");
            }

            Inventory legendaryMenu = Bukkit.createInventory(null, 27, ChatColor.GOLD + "Nidavellir Bank");

            ItemStack spectateItem = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta = spectateItem.getItemMeta();
            spectateMeta.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore = new ArrayList<>();
            spectateLore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore.add("");
            spectateLore.add("§aDescrição:");
            spectateLore.add("§a❙ §7Usado para trocas.");
            spectateLore.add("");
            spectateLore.add("§aEconomia:");
            spectateLore.add("§a❙ §7$ 1,00");
            spectateLore.add("");
            spectateLore.add("§aTaxa de Câmbio:");
            spectateLore.add("§a❙ §7$ 10,00");
            spectateLore.add("");
            spectateLore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta.setLore(spectateLore);
            spectateItem.setItemMeta(spectateMeta);
            legendaryMenu.setItem(0, spectateItem);

            ItemStack spectateItem2 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta2 = spectateItem2.getItemMeta();
            spectateMeta2.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore2 = new ArrayList<>();
            spectateLore2.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore2.add("");
            spectateLore2.add("§aDescrição:");
            spectateLore2.add("§a❙ §7Usado para trocas.");
            spectateLore2.add("");
            spectateLore2.add("§aEconomia:");
            spectateLore2.add("§a❙ §7$ 10,00");
            spectateLore2.add("");
            spectateLore2.add("§aTaxa de Câmbio:");
            spectateLore2.add("§a❙ §7$ 100,00");
            spectateLore2.add("");
            spectateLore2.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta2.setLore(spectateLore2);
            spectateItem2.setItemMeta(spectateMeta2);
            legendaryMenu.setItem(1, spectateItem2);

            ItemStack spectateItem3 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta3 = spectateItem3.getItemMeta();
            spectateMeta3.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore3 = new ArrayList<>();
            spectateLore3.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore3.add("");
            spectateLore3.add("§aDescrição:");
            spectateLore3.add("§a❙ §7Usado para trocas.");
            spectateLore3.add("");
            spectateLore3.add("§aEconomia:");
            spectateLore3.add("§a❙ §7$ 50,00");
            spectateLore3.add("");
            spectateLore3.add("§aTaxa de Câmbio:");
            spectateLore3.add("§a❙ §7$ 500,00");
            spectateLore3.add("");
            spectateLore3.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta3.setLore(spectateLore3);
            spectateItem3.setItemMeta(spectateMeta3);
            legendaryMenu.setItem(2, spectateItem3);

            ItemStack spectateItem4 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta4 = spectateItem4.getItemMeta();
            spectateMeta4.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore4 = new ArrayList<>();
            spectateLore4.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore4.add("");
            spectateLore4.add("§aDescrição:");
            spectateLore4.add("§a❙ §7Usado para trocas.");
            spectateLore4.add("");
            spectateLore4.add("§aEconomia:");
            spectateLore4.add("§a❙ §7$ 100,00");
            spectateLore4.add("");
            spectateLore4.add("§aTaxa de Câmbio:");
            spectateLore4.add("§a❙ §7$ 1.000,00");
            spectateLore4.add("");
            spectateLore4.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta4.setLore(spectateLore4);
            spectateItem4.setItemMeta(spectateMeta4);
            legendaryMenu.setItem(3, spectateItem4);

            ItemStack spectateItem5 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta5 = spectateItem5.getItemMeta();
            spectateMeta5.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore5 = new ArrayList<>();
            spectateLore5.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore5.add("");
            spectateLore5.add("§aDescrição:");
            spectateLore5.add("§a❙ §7Usado para trocas.");
            spectateLore5.add("");
            spectateLore5.add("§aEconomia:");
            spectateLore5.add("§a❙ §7$ 500,00");
            spectateLore5.add("");
            spectateLore5.add("§aTaxa de Câmbio:");
            spectateLore5.add("§a❙ §7$ 5.000,00");
            spectateLore5.add("");
            spectateLore5.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta5.setLore(spectateLore5);
            spectateItem5.setItemMeta(spectateMeta5);
            legendaryMenu.setItem(4, spectateItem5);

            ItemStack spectateItem6 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta6 = spectateItem6.getItemMeta();
            spectateMeta6.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore6 = new ArrayList<>();
            spectateLore6.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore6.add("");
            spectateLore6.add("§aDescrição:");
            spectateLore6.add("§a❙ §7Usado para trocas.");
            spectateLore6.add("");
            spectateLore6.add("§aEconomia:");
            spectateLore6.add("§a❙ §7$ 1.000,00");
            spectateLore6.add("");
            spectateLore6.add("§aTaxa de Câmbio:");
            spectateLore6.add("§a❙ §7$ 10.000,00");
            spectateLore6.add("");
            spectateLore6.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta6.setLore(spectateLore6);
            spectateItem6.setItemMeta(spectateMeta6);
            legendaryMenu.setItem(5, spectateItem6);

            ItemStack spectateItem7 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta7 = spectateItem7.getItemMeta();
            spectateMeta7.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore7 = new ArrayList<>();
            spectateLore7.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore7.add("");
            spectateLore7.add("§aDescrição:");
            spectateLore7.add("§a❙ §7Usado para trocas.");
            spectateLore7.add("");
            spectateLore7.add("§aEconomia:");
            spectateLore7.add("§a❙ §7$ 2.000,00");
            spectateLore7.add("");
            spectateLore7.add("§aTaxa de Câmbio:");
            spectateLore7.add("§a❙ §7$ 20.000,00");
            spectateLore7.add("");
            spectateLore7.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta7.setLore(spectateLore7);
            spectateItem7.setItemMeta(spectateMeta7);
            legendaryMenu.setItem(6, spectateItem7);

            ItemStack spectateItem8 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta8 = spectateItem8.getItemMeta();
            spectateMeta8.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore8 = new ArrayList<>();
            spectateLore8.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore8.add("");
            spectateLore8.add("§aDescrição:");
            spectateLore8.add("§a❙ §7Usado para trocas.");
            spectateLore8.add("");
            spectateLore8.add("§aEconomia:");
            spectateLore8.add("§a❙ §7$ 3.000,00");
            spectateLore8.add("");
            spectateLore8.add("§aTaxa de Câmbio:");
            spectateLore8.add("§a❙ §7$ 30.000,00");
            spectateLore8.add("");
            spectateLore8.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta8.setLore(spectateLore8);
            spectateItem8.setItemMeta(spectateMeta8);
            legendaryMenu.setItem(7, spectateItem8);

            ItemStack spectateItem9 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta9 = spectateItem9.getItemMeta();
            spectateMeta9.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore9 = new ArrayList<>();
            spectateLore9.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore9.add("");
            spectateLore9.add("§aDescrição:");
            spectateLore9.add("§a❙ §7Usado para trocas.");
            spectateLore9.add("");
            spectateLore9.add("§aEconomia:");
            spectateLore9.add("§a❙ §7$ 4.000,00");
            spectateLore9.add("");
            spectateLore9.add("§aTaxa de Câmbio:");
            spectateLore9.add("§a❙ §7$ 40.000,00");
            spectateLore9.add("");
            spectateLore9.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta9.setLore(spectateLore9);
            spectateItem9.setItemMeta(spectateMeta9);
            legendaryMenu.setItem(8, spectateItem9);

            ItemStack spectateItem10 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta10 = spectateItem10.getItemMeta();
            spectateMeta10.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore10 = new ArrayList<>();
            spectateLore10.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore10.add("");
            spectateLore10.add("§aDescrição:");
            spectateLore10.add("§a❙ §7Usado para trocas.");
            spectateLore10.add("");
            spectateLore10.add("§aEconomia:");
            spectateLore10.add("§a❙ §7$ 5.000,00");
            spectateLore10.add("");
            spectateLore10.add("§aTaxa de Câmbio:");
            spectateLore10.add("§a❙ §7$ 50.000,00");
            spectateLore10.add("");
            spectateLore10.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta10.setLore(spectateLore10);
            spectateItem10.setItemMeta(spectateMeta10);
            legendaryMenu.setItem(9, spectateItem10);

            ItemStack spectateItem11 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta11 = spectateItem11.getItemMeta();
            spectateMeta11.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore11 = new ArrayList<>();
            spectateLore11.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore11.add("");
            spectateLore11.add("§aDescrição:");
            spectateLore11.add("§a❙ §7Usado para trocas.");
            spectateLore11.add("");
            spectateLore11.add("§aEconomia:");
            spectateLore11.add("§a❙ §7$ 10.000,00");
            spectateLore11.add("");
            spectateLore11.add("§aTaxa de Câmbio:");
            spectateLore11.add("§a❙ §7$ 100.000,00");
            spectateLore11.add("");
            spectateLore11.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta11.setLore(spectateLore11);
            spectateItem11.setItemMeta(spectateMeta11);
            legendaryMenu.setItem(10, spectateItem11);

            ItemStack spectateItem12 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta12 = spectateItem12.getItemMeta();
            spectateMeta12.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore12 = new ArrayList<>();
            spectateLore12.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore12.add("");
            spectateLore12.add("§aDescrição:");
            spectateLore12.add("§a❙ §7Usado para trocas.");
            spectateLore12.add("");
            spectateLore12.add("§aEconomia:");
            spectateLore12.add("§a❙ §7$ 50.000,00");
            spectateLore12.add("");
            spectateLore12.add("§aTaxa de Câmbio:");
            spectateLore12.add("§a❙ §7$ 500.000,00");
            spectateLore12.add("");
            spectateLore12.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta12.setLore(spectateLore12);
            spectateItem12.setItemMeta(spectateMeta12);
            legendaryMenu.setItem(11, spectateItem12);

            ItemStack spectateItem13 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta13 = spectateItem13.getItemMeta();
            spectateMeta13.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore13 = new ArrayList<>();
            spectateLore13.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore13.add("");
            spectateLore13.add("§aDescrição:");
            spectateLore13.add("§a❙ §7Usado para trocas.");
            spectateLore13.add("");
            spectateLore13.add("§aEconomia:");
            spectateLore13.add("§a❙ §7$ 100.000,00");
            spectateLore13.add("");
            spectateLore13.add("§aTaxa de Câmbio:");
            spectateLore13.add("§a❙ §7$ 1.000.000,00");
            spectateLore13.add("");
            spectateLore13.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta13.setLore(spectateLore13);
            spectateItem13.setItemMeta(spectateMeta13);
            legendaryMenu.setItem(12, spectateItem13);

            ItemStack spectateItem14 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta14 = spectateItem14.getItemMeta();
            spectateMeta14.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore14 = new ArrayList<>();
            spectateLore14.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore14.add("");
            spectateLore14.add("§aDescrição:");
            spectateLore14.add("§a❙ §7Usado para trocas.");
            spectateLore14.add("");
            spectateLore14.add("§aEconomia:");
            spectateLore14.add("§a❙ §7$ 500.000,00");
            spectateLore14.add("");
            spectateLore14.add("§aTaxa de Câmbio:");
            spectateLore14.add("§a❙ §7$ 5.000.000,00");
            spectateLore14.add("");
            spectateLore14.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta14.setLore(spectateLore14);
            spectateItem14.setItemMeta(spectateMeta14);
            legendaryMenu.setItem(13, spectateItem14);

            ItemStack spectateItem15 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta15 = spectateItem15.getItemMeta();
            spectateMeta15.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore15 = new ArrayList<>();
            spectateLore15.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore15.add("");
            spectateLore15.add("§aDescrição:");
            spectateLore15.add("§a❙ §7Usado para trocas.");
            spectateLore15.add("");
            spectateLore15.add("§aEconomia:");
            spectateLore15.add("§a❙ §7$ 1.000.000,00");
            spectateLore15.add("");
            spectateLore15.add("§aTaxa de Câmbio:");
            spectateLore15.add("§a❙ §7$ 10.000.000,00");
            spectateLore15.add("");
            spectateLore15.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta15.setLore(spectateLore15);
            spectateItem15.setItemMeta(spectateMeta15);
            legendaryMenu.setItem(14, spectateItem15);

            ItemStack spectateItem16 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta16 = spectateItem16.getItemMeta();
            spectateMeta16.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore16 = new ArrayList<>();
            spectateLore16.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore16.add("");
            spectateLore16.add("§aDescrição:");
            spectateLore16.add("§a❙ §7Usado para trocas.");
            spectateLore16.add("");
            spectateLore16.add("§aEconomia:");
            spectateLore16.add("§a❙ §7$ 5.000.000,00");
            spectateLore16.add("");
            spectateLore16.add("§aTaxa de Câmbio:");
            spectateLore16.add("§a❙ §7$ 50.000.000,00");
            spectateLore16.add("");
            spectateLore16.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta16.setLore(spectateLore16);
            spectateItem16.setItemMeta(spectateMeta16);
            legendaryMenu.setItem(15, spectateItem16);

            ItemStack spectateItem17 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta17 = spectateItem17.getItemMeta();
            spectateMeta17.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore17 = new ArrayList<>();
            spectateLore17.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore17.add("");
            spectateLore17.add("§aDescrição:");
            spectateLore17.add("§a❙ §7Usado para trocas.");
            spectateLore17.add("");
            spectateLore17.add("§aEconomia:");
            spectateLore17.add("§a❙ §7$ 10.000.000,00");
            spectateLore17.add("");
            spectateLore17.add("§aTaxa de Câmbio:");
            spectateLore17.add("§a❙ §7$ 100.000.000,00");
            spectateLore17.add("");
            spectateLore17.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta17.setLore(spectateLore17);
            spectateItem17.setItemMeta(spectateMeta17);
            legendaryMenu.setItem(16, spectateItem17);

            ItemStack spectateItem18 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta18 = spectateItem18.getItemMeta();
            spectateMeta18.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore18 = new ArrayList<>();
            spectateLore18.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore18.add("");
            spectateLore18.add("§aDescrição:");
            spectateLore18.add("§a❙ §7Usado para trocas.");
            spectateLore18.add("");
            spectateLore18.add("§aEconomia:");
            spectateLore18.add("§a❙ §7$ 50.000.000,00");
            spectateLore18.add("");
            spectateLore18.add("§aTaxa de Câmbio:");
            spectateLore18.add("§a❙ §7$ 500.000.000,00");
            spectateLore18.add("");
            spectateLore18.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta18.setLore(spectateLore18);
            spectateItem18.setItemMeta(spectateMeta18);
            legendaryMenu.setItem(17, spectateItem18);

            ItemStack spectateItem19 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta19 = spectateItem19.getItemMeta();
            spectateMeta19.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore19 = new ArrayList<>();
            spectateLore19.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore19.add("");
            spectateLore19.add("§aDescrição:");
            spectateLore19.add("§a❙ §7Usado para trocas.");
            spectateLore19.add("");
            spectateLore19.add("§aEconomia:");
            spectateLore19.add("§a❙ §7$ 100.000.000,00");
            spectateLore19.add("");
            spectateLore19.add("§aTaxa de Câmbio:");
            spectateLore19.add("§a❙ §7$ 1.000.000.000,00");
            spectateLore19.add("");
            spectateLore19.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta19.setLore(spectateLore19);
            spectateItem19.setItemMeta(spectateMeta19);
            legendaryMenu.setItem(18, spectateItem19);

            ItemStack spectateItem20 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta20 = spectateItem20.getItemMeta();
            spectateMeta20.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore20 = new ArrayList<>();
            spectateLore20.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore20.add("");
            spectateLore20.add("§aDescrição:");
            spectateLore20.add("§a❙ §7Usado para trocas.");
            spectateLore20.add("");
            spectateLore20.add("§aEconomia:");
            spectateLore20.add("§a❙ §7$ 500.000.000,00");
            spectateLore20.add("");
            spectateLore20.add("§aTaxa de Câmbio:");
            spectateLore20.add("§a❙ §7$ 5.000.000.000,00");
            spectateLore20.add("");
            spectateLore20.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta20.setLore(spectateLore20);
            spectateItem20.setItemMeta(spectateMeta20);
            legendaryMenu.setItem(19, spectateItem20);

            ItemStack spectateItem21 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta21 = spectateItem21.getItemMeta();
            spectateMeta21.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore21 = new ArrayList<>();
            spectateLore21.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore21.add("");
            spectateLore21.add("§aDescrição:");
            spectateLore21.add("§a❙ §7Usado para trocas.");
            spectateLore21.add("");
            spectateLore21.add("§aEconomia:");
            spectateLore21.add("§a❙ §7$ 1.000.000.000,00");
            spectateLore21.add("");
            spectateLore21.add("§aTaxa de Câmbio:");
            spectateLore21.add("§a❙ §7$ 10.000.000.000,00");
            spectateLore21.add("");
            spectateLore21.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta21.setLore(spectateLore21);
            spectateItem21.setItemMeta(spectateMeta21);
            legendaryMenu.setItem(20, spectateItem21);

            ItemStack spectateItem22 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta22 = spectateItem22.getItemMeta();
            spectateMeta22.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore22 = new ArrayList<>();
            spectateLore22.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore22.add("");
            spectateLore22.add("§aDescrição:");
            spectateLore22.add("§a❙ §7Usado para trocas.");
            spectateLore22.add("");
            spectateLore22.add("§aEconomia:");
            spectateLore22.add("§a❙ §7$ 5.000.000.000,00");
            spectateLore22.add("");
            spectateLore22.add("§aTaxa de Câmbio:");
            spectateLore22.add("§a❙ §7$ 50.000.000.000,00");
            spectateLore22.add("");
            spectateLore22.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta22.setLore(spectateLore22);
            spectateItem22.setItemMeta(spectateMeta22);
            legendaryMenu.setItem(21, spectateItem22);

            ItemStack spectateItem23 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta23 = spectateItem23.getItemMeta();
            spectateMeta23.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore23 = new ArrayList<>();
            spectateLore23.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore23.add("");
            spectateLore23.add("§aDescrição:");
            spectateLore23.add("§a❙ §7Usado para trocas.");
            spectateLore23.add("");
            spectateLore23.add("§aEconomia:");
            spectateLore23.add("§a❙ §7$ 10.000.000.000,00");
            spectateLore23.add("");
            spectateLore23.add("§aTaxa de Câmbio:");
            spectateLore23.add("§a❙ §7$ 100.000.000.000,00");
            spectateLore23.add("");
            spectateLore23.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta23.setLore(spectateLore23);
            spectateItem23.setItemMeta(spectateMeta23);
            legendaryMenu.setItem(22, spectateItem23);

            ItemStack spectateItem24 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta24 = spectateItem24.getItemMeta();
            spectateMeta24.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore24 = new ArrayList<>();
            spectateLore24.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore24.add("");
            spectateLore24.add("§aDescrição:");
            spectateLore24.add("§a❙ §7Usado para trocas.");
            spectateLore24.add("");
            spectateLore24.add("§aEconomia:");
            spectateLore24.add("§a❙ §7$ 50.000.000.000,00");
            spectateLore24.add("");
            spectateLore24.add("§aTaxa de Câmbio:");
            spectateLore24.add("§a❙ §7$ 500.000.000.000,00");
            spectateLore24.add("");
            spectateLore24.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta24.setLore(spectateLore24);
            spectateItem24.setItemMeta(spectateMeta24);
            legendaryMenu.setItem(23, spectateItem24);

            ItemStack spectateItem25 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta25 = spectateItem25.getItemMeta();
            spectateMeta25.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore25 = new ArrayList<>();
            spectateLore25.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore25.add("");
            spectateLore25.add("§aDescrição:");
            spectateLore25.add("§a❙ §7Usado para trocas.");
            spectateLore25.add("");
            spectateLore25.add("§aEconomia:");
            spectateLore25.add("§a❙ §7$ 100.000.000.000,00");
            spectateLore25.add("");
            spectateLore25.add("§aTaxa de Câmbio:");
            spectateLore25.add("§a❙ §7$ 1.000.000.000.000,00");
            spectateLore25.add("");
            spectateLore25.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta25.setLore(spectateLore25);
            spectateItem25.setItemMeta(spectateMeta25);
            legendaryMenu.setItem(24, spectateItem25);

            ItemStack spectateItem26 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta26 = spectateItem26.getItemMeta();
            spectateMeta26.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore26 = new ArrayList<>();
            spectateLore26.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore26.add("");
            spectateLore26.add("§aDescrição:");
            spectateLore26.add("§a❙ §7Usado para trocas.");
            spectateLore26.add("");
            spectateLore26.add("§aEconomia:");
            spectateLore26.add("§a❙ §7$ 500.000.000.000,00");
            spectateLore26.add("");
            spectateLore26.add("§aTaxa de Câmbio:");
            spectateLore26.add("§a❙ §7$ 5.000.000.000.000,00");
            spectateLore26.add("");
            spectateLore26.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta26.setLore(spectateLore26);
            spectateItem26.setItemMeta(spectateMeta26);
            legendaryMenu.setItem(25, spectateItem26);

            ItemStack spectateItem27 = new ItemStack(Material.PAPER);
            ItemMeta spectateMeta27 = spectateItem27.getItemMeta();
            spectateMeta27.setDisplayName("§d§lSacola de Coins");
            List<String> spectateLore27 = new ArrayList<>();
            spectateLore27.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
            spectateLore27.add("");
            spectateLore27.add("§aDescrição:");
            spectateLore27.add("§a❙ §7Usado para trocas.");
            spectateLore27.add("");
            spectateLore27.add("§aEconomia:");
            spectateLore27.add("§a❙ §7$ 1.000.000.000.000,00");
            spectateLore27.add("");
            spectateLore27.add("§aTaxa de Câmbio:");
            spectateLore27.add("§a❙ §7$ 10.000.000.000.000,00");
            spectateLore27.add("");
            spectateLore27.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
            spectateMeta27.setLore(spectateLore27);
            spectateItem27.setItemMeta(spectateMeta27);
            legendaryMenu.setItem(26, spectateItem27);

            targetPlayer.openInventory(legendaryMenu);
            getLogger().info("O menu foi aberto para " + targetPlayer.getName() + ".");
            return true;
        }
        return false;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equals(ChatColor.GOLD + "Nidavellir Bank")) {
            event.setCancelled(true); // Impede qualquer modificação no inventário
            Player player = (Player) event.getWhoClicked();
            int slot = event.getSlot();
            Economy economy = Bukkit.getServer().getServicesManager().getRegistration(Economy.class).getProvider();

            if (slot == 0) { // Verifica se o jogador clicou no item de compra
                if (economy != null) {
                    double price = 10.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 1,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $10.");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 1) {
                if (economy != null) {
                    double price = 100.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 10,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $100.");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 2) {
                if (economy != null) {
                    double price = 500.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 50,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $500.");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 3) {
                if (economy != null) {
                    double price = 1000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 100,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $1000.");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 4) {
                if (economy != null) {
                    double price = 1500.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 500,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $1500.");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 5) {
                if (economy != null) {
                    double price = 10000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 1.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $10000.");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 6) {
                if (economy != null) {
                    double price = 20000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 2.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $20000.");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 7) {
                if (economy != null) {
                    double price = 30000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 3.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $30000.");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 8) {
                if (economy != null) {
                    double price = 40000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 4.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $40000.");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 9) {
                if (economy != null) {
                    double price = 50000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 5.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $50000.");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 10) {
                if (economy != null) {
                    double price = 100000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 10.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $100000.");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 11) {
                if (economy != null) {
                    double price = 500000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 50.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $500000.");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 12) {
                if (economy != null) {
                    double price = 1000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 100.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $1.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 13) {
                if (economy != null) {
                    double price = 5000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 500.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $5.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 14) {
                if (economy != null) {
                    double price = 10000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 1.000.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $10.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 15) {
                if (economy != null) {
                    double price = 50000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 5.000.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por $50.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 16) {
                if (economy != null) {
                    double price = 100000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 10.000.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por 100.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 17) {
                if (economy != null) {
                    double price = 500000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 50.000.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por 500.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 18) {
                if (economy != null) {
                    double price = 1000000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 100.000.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por 1.000.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 19) {
                if (economy != null) {
                    double price = 5000000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 500.000.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por 5.000.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 20) {
                if (economy != null) {
                    double price = 10000000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 1.000.000.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por 10.000.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 21) {
                if (economy != null) {
                    double price = 50000000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 5.000.000.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por 50.000.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 22) {
                if (economy != null) {
                    double price = 100000000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 10.000.000.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por 100.000.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 23) {
                if (economy != null) {
                    double price = 500000000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 50.000.000.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por 500.000.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 24) {
                if (economy != null) {
                    double price = 1000000000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 100.000.000.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por 1.000.000.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 25) {
                if (economy != null) {
                    double price = 5000000000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 500.000.000.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por 5.000.000.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            } else if (slot == 26) {
                if (economy != null) {
                    double price = 10000000000000.0;
                    if (economy.getBalance(player) >= price) {
                        economy.withdrawPlayer(player, price);
                        ItemStack item = new ItemStack(Material.PAPER);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName("§d§lSacola de Coins");
                        List<String> lore = new ArrayList<>();
                        lore.add("§7- §fInformação da §f[§6Sacola de Moedas§f].");
                        lore.add("");
                        lore.add("§aDescrição:");
                        lore.add("§a❙ §7Usado para trocas.");
                        lore.add("");
                        lore.add("§aEconomia:");
                        lore.add("§a❙ §7$ 1.000.000.000.000,00");
                        lore.add("");
                        lore.add("§a(!) Esse §fITEM §aé §5epíco §amais informações acesse nosso site!");
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);

                        player.getInventory().addItem(item);
                        player.sendMessage(ChatColor.GREEN + "Você comprou uma Sacola de Money por 10.000.000.000.000,00");
                    } else {
                        player.sendMessage(ChatColor.RED + "Você não tem dinheiro suficiente para comprar este item.");
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "O sistema de economia não está disponível.");
                }
            }
        }
    }

}
