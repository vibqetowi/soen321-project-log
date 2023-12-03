package com.google.firebase.components;

import hd.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: u  reason: collision with root package name */
    public final List<b<?>> f9560u;

    public DependencyCycleException(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
        this.f9560u = arrayList;
    }
}
