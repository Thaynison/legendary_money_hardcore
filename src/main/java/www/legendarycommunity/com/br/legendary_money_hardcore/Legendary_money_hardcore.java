package www.legendarycommunity.com.br.legendary_money_hardcore;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.java.JavaPlugin;
import www.legendarycommunity.com.br.legendary_money_hardcore.moedas.nidavellir;
import www.legendarycommunity.com.br.legendary_money_hardcore.moedas.hardcore;
import www.legendarycommunity.com.br.legendary_money_hardcore.moedas.tokens;

import java.util.ArrayList;
import java.util.List;

public final class Legendary_money_hardcore extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        hardcore hardcoreHandler = new hardcore();
        Bukkit.getPluginManager().registerEvents(hardcoreHandler, this);
        nidavellir nidavellirHandler = new nidavellir();
        Bukkit.getPluginManager().registerEvents(nidavellirHandler, this);
        tokens tokensHandler = new tokens();
        Bukkit.getPluginManager().registerEvents(tokensHandler, this);

        Bukkit.getPluginManager().registerEvents(this, this);

        this.getCommand("bankhardcore").setExecutor(new hardcore());
        this.getCommand("banknidavellir").setExecutor(new nidavellir());
        this.getCommand("banktokens").setExecutor(new tokens());

        getLogger().info("Legendary Classes Plugin iniciado!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Legendary Classes Plugin desligado!");
    }

}
