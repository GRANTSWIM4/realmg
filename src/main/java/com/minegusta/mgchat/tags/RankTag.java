package com.minegusta.mgchat.tags;

import com.demigodsrpg.chitchat.tag.DefaultPlayerTag;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

public enum RankTag
{
    ADMIN(ChatColor.DARK_RED + "[A]", 5),
    MODERATOR(ChatColor.DARK_AQUA + "[M]", 5),
    MODERATORPLUS(ChatColor.DARK_AQUA + "[M" + ChatColor.GOLD + "+" + ChatColor.DARK_AQUA + "]", 5),
    TRUSTED(ChatColor.BLUE + "[T]", 5),
    OWNER(ChatColor.YELLOW + "[O]", 5),
    OVERSEER(ChatColor.GRAY + "«" + ChatColor.GOLD + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + ChatColor.GRAY + "»", 5),
    BUILDERPLUS(ChatColor.DARK_GREEN + "[B+]", 5),
    BUILDER(ChatColor.GREEN + "[B]", 5),
    HEADADMIN(ChatColor.RED + "[H]", 6),
    DONOR10(ChatColor.GOLD + "[" + ChatColor.DARK_GREEN + "10" + ChatColor.GOLD + "]", 4),
    DONOR20(ChatColor.GOLD + "[" + ChatColor.DARK_GREEN + "20" + ChatColor.GOLD + "]", 4),
    DONOR30(ChatColor.GOLD + "[" + ChatColor.DARK_GREEN + "30" + ChatColor.GOLD + "]", 4),
    DONOR40(ChatColor.GOLD + "[" + ChatColor.DARK_GREEN + "40" + ChatColor.GOLD + "]", 4),
    DONOR50(ChatColor.GOLD + "[" + ChatColor.DARK_GREEN + "50" + ChatColor.GOLD + "]", 4),
    DONOR60(ChatColor.GOLD + "[" + ChatColor.DARK_GREEN + "60" + ChatColor.GOLD + "]", 4),
    DONOR70(ChatColor.GOLD + "[" + ChatColor.DARK_GREEN + "70" + ChatColor.GOLD + "]", 4),
    DONOR80(ChatColor.GOLD + "[" + ChatColor.DARK_GREEN + "80" + ChatColor.GOLD + "]", 4),
    DONOR90(ChatColor.GOLD + "[" + ChatColor.DARK_GREEN + "90" + ChatColor.GOLD + "]", 4),
    DONOR100(ChatColor.GOLD + "[" + ChatColor.DARK_GREEN + "100" + ChatColor.GOLD + "]", 4),
    DONOR150(ChatColor.GOLD + "[" + ChatColor.DARK_GREEN + "150" + ChatColor.GOLD + "]", 4);

    
    private DefaultPlayerTag tag;
    
    private RankTag(String text, int priority)
    {
        tag = new DefaultPlayerTag(name(), "minegusta.rank." + name().toLowerCase(), text, priority);
        try 
        {
            Bukkit.getPluginManager().addPermission(new Permission("minegusta.rank." + name().toLowerCase(), PermissionDefault.FALSE));
        } 
        catch (Exception ignored){}
    }
    
    public DefaultPlayerTag getTag()
    {
        return tag;
    }
}
