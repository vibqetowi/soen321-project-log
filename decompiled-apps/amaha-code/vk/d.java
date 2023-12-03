package vk;

import java.util.ArrayList;
import kotlin.jvm.internal.i;
/* compiled from: CommunityPostsModel.kt */
/* loaded from: classes2.dex */
public final class d {
    @tf.b("list")

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<c> f35252a = new ArrayList<>();

    public final ArrayList<c> a() {
        return this.f35252a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && i.b(this.f35252a, ((d) obj).f35252a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35252a.hashCode();
    }

    public final String toString() {
        return "CommunityPostsModel(list=" + this.f35252a + ')';
    }
}
