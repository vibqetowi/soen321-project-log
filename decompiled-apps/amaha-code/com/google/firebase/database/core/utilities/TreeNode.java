package com.google.firebase.database.core.utilities;

import com.google.firebase.database.snapshot.ChildKey;
import java.util.HashMap;
import java.util.Map;
import v.g;
/* loaded from: classes.dex */
public class TreeNode<T> {
    public Map<ChildKey, TreeNode<T>> children = new HashMap();
    public T value;

    public String toString(String str) {
        StringBuilder d10 = g.d(str, "<value>: ");
        d10.append(this.value);
        d10.append("\n");
        String sb2 = d10.toString();
        if (this.children.isEmpty()) {
            return d.f(sb2, str, "<empty>");
        }
        for (Map.Entry<ChildKey, TreeNode<T>> entry : this.children.entrySet()) {
            StringBuilder d11 = g.d(sb2, str);
            d11.append(entry.getKey());
            d11.append(":\n");
            d11.append(entry.getValue().toString(str + "\t"));
            d11.append("\n");
            sb2 = d11.toString();
        }
        return sb2;
    }
}
