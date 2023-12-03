package com.google.firebase.database.core.utilities;
/* loaded from: classes.dex */
public final class Pair<T, U> {
    private final T first;
    private final U second;

    public Pair(T t3, U u10) {
        this.first = t3;
        this.second = u10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Pair.class != obj.getClass()) {
            return false;
        }
        Pair pair = (Pair) obj;
        T t3 = this.first;
        if (t3 == null ? pair.first != null : !t3.equals(pair.first)) {
            return false;
        }
        U u10 = this.second;
        U u11 = pair.second;
        if (u10 == null ? u11 == null : u10.equals(u11)) {
            return true;
        }
        return false;
    }

    public T getFirst() {
        return this.first;
    }

    public U getSecond() {
        return this.second;
    }

    public int hashCode() {
        int i6;
        T t3 = this.first;
        int i10 = 0;
        if (t3 != null) {
            i6 = t3.hashCode();
        } else {
            i6 = 0;
        }
        int i11 = i6 * 31;
        U u10 = this.second;
        if (u10 != null) {
            i10 = u10.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "Pair(" + this.first + "," + this.second + ")";
    }
}
