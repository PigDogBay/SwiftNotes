package com.pigdogbay.swiftnotes.model;

/**
 * Created by Mark on 19/01/2015.
 */
public class Note {

    private int _TitleId;
    private int _DetailId;

    public int getTitleId() {
        return _TitleId;
    }

    public int getDetailId() {
        return _DetailId;
    }

    public Note(int titleId, int detailId) {
        _TitleId = titleId;
        _DetailId = detailId;
    }

    @Override
    public String toString() {
        return Integer.toString(getTitleId());
    }


}