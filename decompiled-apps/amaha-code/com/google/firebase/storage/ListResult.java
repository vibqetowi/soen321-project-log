package com.google.firebase.storage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ListResult {
    private static final String ITEMS_KEY = "items";
    private static final String NAME_KEY = "name";
    private static final String PAGE_TOKEN_KEY = "nextPageToken";
    private static final String PREFIXES_KEY = "prefixes";
    private final List<StorageReference> items;
    private final String pageToken;
    private final List<StorageReference> prefixes;

    public ListResult(List<StorageReference> list, List<StorageReference> list2, String str) {
        this.prefixes = list;
        this.items = list2;
        this.pageToken = str;
    }

    public static ListResult fromJSON(FirebaseStorage firebaseStorage, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has(PREFIXES_KEY)) {
            JSONArray jSONArray = jSONObject.getJSONArray(PREFIXES_KEY);
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                String string = jSONArray.getString(i6);
                if (string.endsWith("/")) {
                    string = string.substring(0, string.length() - 1);
                }
                arrayList.add(firebaseStorage.getReference(string));
            }
        }
        if (jSONObject.has(ITEMS_KEY)) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(ITEMS_KEY);
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                arrayList2.add(firebaseStorage.getReference(jSONArray2.getJSONObject(i10).getString("name")));
            }
        }
        return new ListResult(arrayList, arrayList2, jSONObject.optString(PAGE_TOKEN_KEY, null));
    }

    public List<StorageReference> getItems() {
        return this.items;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public List<StorageReference> getPrefixes() {
        return this.prefixes;
    }
}
