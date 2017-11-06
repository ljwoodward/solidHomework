package example.codeclan.com.singleresponsibility;

import java.util.ArrayList;

/**
 * Created by janemackay on 06/11/2017.
 */

public class Journal {

    private ArrayList<String> journalEntries;
    private Bear owner;

    public Journal(Bear owner){
        journalEntries = new ArrayList<String>();
        this.owner = owner;
    }

    public void writeJournal(String entry){
        journalEntries.add(entry);
    }

    public String getJournalEntry(int index){
        return journalEntries.get(index);
    }

    public String getLastJournalEntry(){
        return getJournalEntry(journalEntries.size() - 1);
    }
}
