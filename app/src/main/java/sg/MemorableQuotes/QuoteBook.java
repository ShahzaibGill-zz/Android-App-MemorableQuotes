package sg.MemorableQuotes;

import java.util.Random;

/**
 * Created by Shahzaib Gill on 12/31/2014.
 */
public class QuoteBook {

    public String[] mQuotes = {
            "“It's like everyone tells a story about themselves inside their own head. Always. All the time. That story makes you what you are. We build ourselves out of that story.” \n" +
                    "― Patrick Rothfuss, The Name of the Wind\n",
            "“We understand how dangerous a mask can be. We all become what we pretend to be.” \n" +
                    "― Patrick Rothfuss, The Name of the Wind\n",
            "“Knowing your own ignorance is the first step to enlightenment.” \n" +
                    "― Patrick Rothfuss, The Wise Man's Fear\n",
            "“Words can light fires in the minds of men. Words can wring tears from the hardest hearts.” \n" +
                    "― Patrick Rothfuss, The Wise Man's Fear\n",
            "“If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.” \n" +
                    "― J.K. Rowling, Harry Potter and the Goblet of Fire\n",
            "“We accept the love we think we deserve.” \n" +
                    "― Stephen Chbosky, The Perks of Being a Wallflower\n",
            "“It is better to be hated for what you are than to be loved for what you are not.” \n" +
                    "― André Gide, Autumn Leaves\n",
            "“It is our choices, Harry, that show what we truly are, far more than our abilities.” \n" +
                    "― J.K. Rowling, Harry Potter and the Chamber of Secrets\n",
            "“You gave me a forever within the numbered days, and I'm grateful.” \n" +
                    "― John Green, The Fault in Our Stars\n",
            "“The man who does not read has no advantage over the man who cannot read.” \n" +
                    "― Mark Twain\n",
            "“Fairy tales are more than true: not because they tell us that dragons exist, but because they tell us that dragons can be beaten.” \n" +
                    "― Neil Gaiman, Coraline\n",
            "“We read to know we're not alone.” \n" +
                    "― William Nicholson, Shadowlands\n",
            "“It takes a great deal of bravery to stand up to our enemies, but just as much to stand up to our friends.” \n" +
                    "― J.K. Rowling, Harry Potter and the Sorcerer's Stone\n",
            "“A reader lives a thousand lives before he dies, said Jojen. The man who never reads lives only one.” \n" +
                    "― George R.R. Martin, A Dance with Dragons\n",
            "“There is no greater agony than bearing an untold story inside you.” \n" +
                    "― Maya Angelou, I Know Why the Caged Bird Sings\n",
            "“You don’t forget the face of the person who was your last hope.” \n" +
                    "― Suzanne Collins, The Hunger Games\n",
            "“The purpose of a storyteller is not to tell you how to think, but to give you questions to think upon.” \n" +
                    "― Brandon Sanderson, The Way of Kings\n",
            "“Expectations were like fine pottery. The harder you held them, the more likely they were to crack.” \n" +
                    "― Brandon Sanderson, The Way of Kings\n",
            "“But you can't kill me, Lord Tyrant. I represent that one thing you've never been able to kill, no matter how hard you try. I am hope.” \n" +
                    "― Brandon Sanderson, The Final Empire\n",
            "“Of all forms of caution, caution in love is perhaps the most fatal to true happiness.” \n" +
                    "― Bertrand Russell, The Conquest of Happiness\n",
            "“No one can make you feel inferior without your consent.” \n" +
                    "― Eleanor Roosevelt, This is My Story\n",
            "It may be unfair, but what happens in a few days, sometimes even a single day, can change the course of a whole lifetime...” \n" +
                    "― Khaled Hosseini, The Kite Runner\n",
            "“I suspect the truth is that we are waiting, all of us, against insurmountable odds, for something extraordinary to happen to us.” \n" +
                    "― Khaled Hosseini, And the Mountains Echoed\n",
            "“Marriage can wait, education cannot.” \n" +
                    "― Khaled Hosseini, A Thousand Splendid Suns\n",
            "“Practice isn't the thing you do once you're good. It's the thing you do that makes you good.” \n" +
                    "― Malcolm Gladwell, Outliers: The Story of Success\n",
            "“Who we are cannot be separated from where we're from.” \n" +
                    "― Malcolm Gladwell, Outliers: The Story of Success\n",
            "“Giants are not what we think they are. The same qualities that appear to give them strength are often the sources of great weakness.” \n" +
                    "― Malcolm Gladwell, David and Goliath\n",
            "“Books are my friends, my companions. They make me laugh and cry and find meaning in life.”\n" +
                    "― Christopher Paolini, Eragon\n",
            "“Keep in mind that many people have died for their beliefs; it's actually quite common. The real courage is in living and suffering for what you believe.” \n" +
                    "― Christopher Paolini, Eragon\n",
            "“The greatest enemy is one that has nothing to lose.” \n" +
                    "― Christopher Paolini, Eragon\n",
            "“I'm right and you're wrong, I'm big and you're small, and there's nothing you can do about it.” \n" +
                    "― Roald Dahl, Matilda\n",
            "“We all have our moments of brilliance and glory, and this was mine.” \n" +
                    "― Roald Dahl, Boy: Tales of Childhood\n",
            "“If you are good life is good.” \n" +
                    "― Roald Dahl, Matilda\n",
            "“I'd rather be fried alive and eaten by Mexicans.” \n" +
                    "― Roald Dahl, James and the Giant Peach\n",
            "“A hunted man sometimes wearies of distrust and longs for friendship.” \n" +
                    "― J.R.R. Tolkien, The Lord of the Rings\n",
            "“The world is indeed full of peril and in it there are many dark places.” \n" +
                    "― J.R.R. Tolkien, The Lord of the Rings\n",
            "“Where there's life there's hope.” \n" +
                    "― J.R.R. Tolkien, The Hobbit\n",
            "“There are no safe paths in this part of the world. Remember you are over the Edge of the Wild now, and in for all sorts of fun wherever you go.” \n" +
                    "― J.R.R. Tolkien, The Hobbit\n",
            "“I'm done with those; regrets are an excuse for people who have failed.” \n" +
                    "― Ned Vizzini, It's Kind of a Funny Story\n",
            "“I don't owe people anything, and I don't have to talk to them any more than I feel I need to.” \n" +
                    "― Ned Vizzini, It's Kind of a Funny Story\n",
            "“Dreams are only dreams until you wake up and make them real.” \n" +
                    "― Ned Vizzini, It's Kind of a Funny Story\n",
            "“The worst part of holding the memories is not the pain. It's the loneliness of it. Memories need to be shared.” \n" +
                    "― Lois Lowry, The Giver\n",
            "“We gained control of many things. But we had to let go of others.” \n" +
                    "― Lois Lowry, The Giver\n",
            "“One day, you will be old enough to start reading fairytales again.” \n" +
                    "― C.S. Lewis, The Chronicles of Narnia\n",
            "“A noble friend is the best gift. A noble enemy is the next best.” \n" +
                    "― C.S. Lewis, The Chronicles of Narnia\n",
            "“Stories are light. Light is precious in a world so dark. Begin at the beginning. Tell Gregory a story. Make some light.” \n" +
                    "― Kate DiCamillo, The Tale of Despereaux\n",
            "“Reader, you must know that an interesting fate (sometimes involving rats, sometimes not) awaits almost everyone, mouse or man, who does not conform.” \n" +
                    "― Kate DiCamillo, Tale of Despereaux\n",
            "“Books have to be heavy because the whole world's inside them.” \n" +
                    "― Cornelia Funke, Inkheart\n",
            "“Because fear kills everything,\" Mo had once told her. \"Your mind, your heart, your imagination.” \n" +
                    "― Cornelia Funke, Inkheart\n",

    };

    public String getQuote() {


        // The button was clicked so update the quote label with a new quote
        String quote = "";

        // Randomly select a quote by constructing new random generator
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mQuotes.length);

        quote = mQuotes[randomNumber];

        return quote;
    }
}
