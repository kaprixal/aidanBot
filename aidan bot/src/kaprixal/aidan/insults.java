package kaprixal.aidan;

import java.util.Random;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class insults extends ListenerAdapter{
	  
	String [] aidanStinks = {
	"haha <@229645750307520512> stinky :poo:", 
	"<@229645750307520512> u stink!!!!", 
	"<@229645750307520512> stink mom !", 
	"<@229645750307520512>....yo mama :flushed:",
	"stink bomb <@229645750307520512> man",
	"<@229645750307520512> yo mama sorting my recursive bubbles",
	"ill continue doing ur mom <@229645750307520512> !!!"
	};

	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

	  String[] args = event.getMessage().getContentRaw().split("\\s+");

	  if (args[0].equalsIgnoreCase(Main.prefix + "aidan")){

	    Random rand = new Random();
	    int number = rand.nextInt(aidanStinks.length);

	    String message = aidanStinks[number];
	    
	    event.getChannel().sendTyping().queue();
	    event.getChannel().sendMessage(message).queue();
	    		
}
	}
}
