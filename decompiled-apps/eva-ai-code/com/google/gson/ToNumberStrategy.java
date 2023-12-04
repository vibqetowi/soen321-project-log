package com.google.gson;

import com.google.gson.stream.JsonReader;
import java.io.IOException;
/* loaded from: classes7.dex */
public interface ToNumberStrategy {
    Number readNumber(JsonReader jsonReader) throws IOException;
}
