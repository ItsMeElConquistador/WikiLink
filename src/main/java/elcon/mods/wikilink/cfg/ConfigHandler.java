package elcon.mods.wikilink.cfg;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigHandler
{
    public static boolean enableDebugger;
    
    /** Tooltip Sector **/ 
    public static boolean includeTooltipsOnItems;
    
    public static boolean enableWiki;    
    public static boolean enableGoogle;
    public static boolean enableThread;
    public static boolean enableWebsite;
    public static boolean enableYoutube;
    public static boolean enableSummarize;
       
    public static boolean debugMode;
    
    /** Link Shortener Sector **/
    public static boolean shortenHyperlinks;
    
    public static void init(File file)
    {
        Configuration config = new Configuration(file);
            config.load();
            
            /** Tooltip Sector **/ 
            config.addCustomCategoryComment("Tooltip Options", "These are the options used to control how WikiLink displays tooltips on items when hovering over them in the inventory.");
                includeTooltipsOnItems = config.get("Tooltip Options", "includeTooltipsOnItems", true).getBoolean(true);
           
            /** Link Selection Sector **/
            config.addCustomCategoryComment("Link Selection", "These are the options used to control the different links that appear inside of the WikiLink Menu.");
                enableWiki = config.get("Link Selection", "enableWiki", true).getBoolean(true);
                enableGoogle = config.get("Link Selection", "enableGoogle", true).getBoolean(true);
                enableThread = config.get("Link Selection", "enableThread", true).getBoolean(true);
                enableWebsite = config.get("Link Selection", "enableWebsite", true).getBoolean(true);
                enableYoutube = config.get("Link Selection", "enableYoutube", true).getBoolean(true);
                enableSummarize = config.get("Link Selection", "enableSummarize", true).getBoolean(true);
                
            /** Link Shortener Sector **/
            config.addCustomCategoryComment("Link Shortener Options", "These are the options to change how WikiLink shortens all of it's hyperlinks.");
                shortenHyperlinks = config.get("Link Shortener Options", "shortenHyperlinks", true, "Use bit.ly to shorten links generated by WikiLink").getBoolean(true);
            
            debugMode = config.get("Debug Options", "debugMode", false, "Use this during startup/runtime to get your console spammed curtosy of WikiLink :)").getBoolean(false);    
                
            config.save();
    }
}
