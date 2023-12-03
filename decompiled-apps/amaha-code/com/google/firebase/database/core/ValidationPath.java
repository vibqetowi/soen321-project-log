package com.google.firebase.database.core;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.snapshot.ChildKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r1.b0;
/* loaded from: classes.dex */
public class ValidationPath {
    public static final int MAX_PATH_DEPTH = 32;
    public static final int MAX_PATH_LENGTH_BYTES = 768;
    private int byteLength;
    private final List<String> parts = new ArrayList();

    private ValidationPath(Path path) {
        this.byteLength = 0;
        Iterator<ChildKey> it = path.iterator();
        while (it.hasNext()) {
            this.parts.add(it.next().asString());
        }
        this.byteLength = Math.max(1, this.parts.size());
        for (int i6 = 0; i6 < this.parts.size(); i6++) {
            this.byteLength += utf8Bytes(this.parts.get(i6));
        }
        checkValid();
    }

    private void checkValid() {
        if (this.byteLength <= 768) {
            if (this.parts.size() <= 32) {
                return;
            }
            throw new DatabaseException("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle " + toErrorString());
        }
        throw new DatabaseException(pl.a.g(new StringBuilder("Data has a key path longer than 768 bytes ("), this.byteLength, ")."));
    }

    private static String joinStringList(String str, List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (i6 > 0) {
                sb2.append(str);
            }
            sb2.append(list.get(i6));
        }
        return sb2.toString();
    }

    private String pop() {
        List<String> list;
        String remove = this.parts.remove(list.size() - 1);
        this.byteLength -= utf8Bytes(remove);
        if (this.parts.size() > 0) {
            this.byteLength--;
        }
        return remove;
    }

    private void push(String str) {
        if (this.parts.size() > 0) {
            this.byteLength++;
        }
        this.parts.add(str);
        this.byteLength += utf8Bytes(str);
        checkValid();
    }

    private String toErrorString() {
        if (this.parts.size() == 0) {
            return "";
        }
        return b0.b(new StringBuilder("in path '"), joinStringList("/", this.parts), "'");
    }

    private static int utf8Bytes(CharSequence charSequence) {
        int length = charSequence.length();
        int i6 = 0;
        int i10 = 0;
        while (i6 < length) {
            char charAt = charSequence.charAt(i6);
            if (charAt <= 127) {
                i10++;
            } else if (charAt <= 2047) {
                i10 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i10 += 4;
                i6++;
            } else {
                i10 += 3;
            }
            i6++;
        }
        return i10;
    }

    public static void validateWithObject(Path path, Object obj) {
        new ValidationPath(path).withObject(obj);
    }

    private void withObject(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    push(str);
                    withObject(map.get(str));
                    pop();
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            for (int i6 = 0; i6 < list.size(); i6++) {
                push(Integer.toString(i6));
                withObject(list.get(i6));
                pop();
            }
        }
    }
}
