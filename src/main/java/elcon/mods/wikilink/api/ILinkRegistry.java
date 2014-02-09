package elcon.mods.wikilink.api;

public interface ILinkRegistry {

	/**
	 * Register a new link type
	 * 
	 * @param linkType Link type to register
	 */
	public void registerLinkType(ILinkType linkType);
	
	/**
	 * Regsiter a new link mod
	 * 
	 * @param linkMod Link mod to register
	 */
	public void registerLinkMod(ILinkMod linkMod);
	
	/**
	 * Generate a link mod without thread, site, forum and wiki
	 * See {@link #generateLinkMod(Object, String, String, String, String) generateLinkMod}
	 * 
	 * @param mod
	 * @return
	 */
	public ILinkMod generateLinkMod(Object mod);
	
	/**
	 * Generate a link mod, basically a mod that supports WikiLink
	 * 
	 * @param mod Instance of the mod, should have a {@link cpw.mods.fml.common.Mod} annotation
	 * @param thread Thread URL for the mod
	 * @param site Site URL for the mod
	 * @param forum Forum URL for the mod
	 * @param wiki Wiki URL for the mod
	 * @return A link mod object to register using {@link #registerLinkMod(ILinkMod) registerLinkMod}
	 */
	public ILinkMod generateLinkMod(Object mod, String thread, String site, String forum, String wiki);
	
	/**
	 * Get a link for a topic. This will use a cached link or generate a new one
	 * A link ojbects contains one or more URLs
	 * 
	 * @param topic A topic (example: ItemStack)
	 * @return A link object for the topic
	 */
	public ILink getLink(Object topic);
	
	/**
	 * Get the link mod that for this name
	 * 
	 * @param mod The name of a mod
	 * @return Return the link mod or null, if it doesn't exist
	 */
	public ILinkMod getLinkMod(String mod);
}
