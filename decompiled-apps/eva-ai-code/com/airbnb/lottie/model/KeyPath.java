package com.airbnb.lottie.model;

import io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* loaded from: classes2.dex */
public class KeyPath {
    public static final KeyPath COMPOSITION = new KeyPath("COMPOSITION");
    private final List<String> keys;
    private KeyPathElement resolvedElement;

    public KeyPath(String... strArr) {
        this.keys = Arrays.asList(strArr);
    }

    private KeyPath(KeyPath keyPath) {
        this.keys = new ArrayList(keyPath.keys);
        this.resolvedElement = keyPath.resolvedElement;
    }

    public KeyPath addKey(String str) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.keys.add(str);
        return keyPath;
    }

    public KeyPath resolve(KeyPathElement keyPathElement) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.resolvedElement = keyPathElement;
        return keyPath;
    }

    public KeyPathElement getResolvedElement() {
        return this.resolvedElement;
    }

    public boolean matches(String str, int i) {
        if (isContainer(str)) {
            return true;
        }
        if (i >= this.keys.size()) {
            return false;
        }
        return this.keys.get(i).equals(str) || this.keys.get(i).equals("**") || this.keys.get(i).equals(WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD);
    }

    public int incrementDepthBy(String str, int i) {
        if (isContainer(str)) {
            return 0;
        }
        if (this.keys.get(i).equals("**")) {
            return (i != this.keys.size() - 1 && this.keys.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean fullyResolvesTo(String str, int i) {
        if (i >= this.keys.size()) {
            return false;
        }
        boolean z = i == this.keys.size() - 1;
        String str2 = this.keys.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.keys.size() + (-2) && endsWithGlobstar())) && (str2.equals(str) || str2.equals(WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD));
        }
        if (!z && this.keys.get(i + 1).equals(str)) {
            return i == this.keys.size() + (-2) || (i == this.keys.size() + (-3) && endsWithGlobstar());
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.keys.size() - 1) {
                return false;
            }
            return this.keys.get(i2).equals(str);
        }
    }

    public boolean propagateToChildren(String str, int i) {
        return "__container".equals(str) || i < this.keys.size() - 1 || this.keys.get(i).equals("**");
    }

    private boolean isContainer(String str) {
        return "__container".equals(str);
    }

    private boolean endsWithGlobstar() {
        List<String> list = this.keys;
        return list.get(list.size() - 1).equals("**");
    }

    public String keysToString() {
        return this.keys.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeyPath keyPath = (KeyPath) obj;
        if (this.keys.equals(keyPath.keys)) {
            KeyPathElement keyPathElement = this.resolvedElement;
            KeyPathElement keyPathElement2 = keyPath.resolvedElement;
            return keyPathElement != null ? keyPathElement.equals(keyPathElement2) : keyPathElement2 == null;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.keys.hashCode() * 31;
        KeyPathElement keyPathElement = this.resolvedElement;
        return hashCode + (keyPathElement != null ? keyPathElement.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.keys);
        sb.append(",resolved=");
        sb.append(this.resolvedElement != null);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
