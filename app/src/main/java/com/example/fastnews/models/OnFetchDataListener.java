package com.example.fastnews.models;

import java.util.List;

public interface OnFetchDataListener <NewsApiResponse>{

    void onFetchData(List<NewsHeadlines> list,String message);
    void onError(String message );
}
