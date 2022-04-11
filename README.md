# Friend Maker-Inator
Bot that converses with the user

This agent receives an input from the user via any Discord messaging channel. The agent then uses a keyword system to generate an appropriate output message. The output message is then sent to the user via the Discord channel.

# Individual Project - Karlen - New Features
1. Google translator: The agent is able to receive an input string, then convert that string to the chosen language. This tool is useful if a user ever needs anything translated, it's simple and easily accessible through Discord. The user may indicate the chosen language that the string should be translated to giving it a conversationalist style.

Google Translate setup: Using Google Scripts, I created a scrpit that would translate the given input string using Google API. Using this URL: https://script.google.com/macros/s/AKfycbwdB7XLqYLW3QJsHbTaAb0qmRRwqWrRhUnCtBBINbNur32hxUnpdNEX0aBhnMRYGH8g/exec allowed the Chatbot to converse with the google script.

2. Wikipedia API: The method allows the agent to attain information of a wikipedia page. The user is to specify which page they want information about, the bot will then search wikipedia for the given topic. This feature is great for adding more detail to a conversation, or generally if the user is curious about something or someone. 

Wikipedia API setup: Using the jar file jsoup-1.14.3, the agent will be able to search wikipedia pages depending on user input. Jar file obtained from: https://jsoup.org/download

# Individual Project - Karlen - Old Features
1. Switch statement keyword system: Our agent uses a keyword system to generate the appropriate output to send to the user. The keyword system is fitted with multiple topics, greetings, small-talk phrases, and reactions that can be used in the agent's output. We have even implemented some randomization when it comes to the agent's response, so that the conversation can always be unique.

2. Parts of speech tagging Method: This method can identify the type of words used in the message sent by the user. Depending on the nouns used in the sentence the agent will respond with a more engaged output. This can make conversations more interesting and shows that the agent is trying to keep the conversation flowing.

POS Tagging setup: Java build path libraries need the required jar files added to the Classpath. Jar files are located in the lib folder from the top link: https://www.apache.org/dyn/closer.cgi/opennlp/opennlp-1.9.4/apache-opennlp-1.9.4-bin.zip

Required model for POS Tagging: Download opennlp-en-ud-ewt-pos-1.0-1.9.3.bin from: https://opennlp.apache.org/models.html

3. NameFinder method: This method can identify names in a message sent by the user. The agent will respond addressing the given name instead of outputting a generic sentence. This makes the conversation more natural and shows that the agent is "listening" to the user.

NameFinder setup: Java build path libraries need the required jar files added to the Classpath. Jar files are located in the lib folder from the top link: https://www.apache.org/dyn/closer.cgi/opennlp/opennlp-1.9.4/apache-opennlp-1.9.4-bin.zip

Required model for NameFinder: Download en-ner-person.bin from: http://opennlp.sourceforge.net/models-1.5/
    
# Demo Conversations

Google Translate: The agent will prompt the user with translating format, once done it will translate any string.

<img width="379" src="https://cdn.discordapp.com/attachments/782402607393538061/962865401711181944/310proj_2.PNG">

Wikipedia API: The agent is able to display information about the wikipedia page chosen, in this case, Ed Sheeran.

<img width="379" src="https://cdn.discordapp.com/attachments/782402607393538061/962865447911440464/310proj_1.PNG">

POS Tagging: The agent is able to identify the specific item that the user is talking about and delivers an involved response.

<img width="379" src="https://user-images.githubusercontent.com/99511208/158702513-d25860e9-c6ce-43cc-9182-b5afecd0345b.png">

NameFinder: The agent is able to identify names within a message and generate an output that incorporates the name that was identified.

<img width = "379" src="https://user-images.githubusercontent.com/99511208/158907144-532fd37c-f032-4f58-9654-a0eb9511e57c.png">

