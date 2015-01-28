package com.pigdogbay.swiftnotes.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pigdogbay.swiftnotes.R;

/**
 * Created by Mark on 19/01/2015.
 */
public class NoteData {

    public static List<Note> NOTES = new ArrayList<Note>();
    public static Map<String,Note> ITEM_MAP = new HashMap<String,Note>();
    static
    {
        addItem(new Note(R.string.title_introduction, R.string.detail_introduction));
        addItem(new Note(R.string.title_1, R.string.detail_1));
        addItem(new Note(R.string.title_2, R.string.detail_2));
        addItem(new Note(R.string.title_3, R.string.detail_3));
        addItem(new Note(R.string.title_4, R.string.detail_4));
        addItem(new Note(R.string.title_5, R.string.detail_5));
        addItem(new Note(R.string.title_6, R.string.detail_6));
        addItem(new Note(R.string.title_7, R.string.detail_7));
        addItem(new Note(R.string.title_8, R.string.detail_8));
        addItem(new Note(R.string.title_9, R.string.detail_9));
        addItem(new Note(R.string.title_10, R.string.detail_10));
        addItem(new Note(R.string.title_11, R.string.detail_11));
        addItem(new Note(R.string.title_12, R.string.detail_12));
        addItem(new Note(R.string.title_13, R.string.detail_13));
        addItem(new Note(R.string.title_14, R.string.detail_14));
    }

    private static void addItem(Note note)
    {
        NOTES.add(note);
        ITEM_MAP.put(note.toString(),note);
    }

}
