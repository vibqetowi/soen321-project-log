package androidx.compose.ui.tooling;

import androidx.compose.ui.tooling.PreviewLogger;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
/* compiled from: PreviewUtils.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002\u001a3\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0014\u0010\u000b\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\u0010\u0010\u001a\u001a\u0010\u0011\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r\u0018\u00010\f*\u00020\u0012H\u0000\u001a&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a\"\u0010\u0014\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a)\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"findGroupsThatMatchPredicate", "", "Landroidx/compose/ui/tooling/data/Group;", "root", "predicate", "Lkotlin/Function1;", "", "findOnlyFirst", "getPreviewProviderParameters", "", "", "parameterProviderClass", "Ljava/lang/Class;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "parameterProviderIndex", "", "(Ljava/lang/Class;I)[Ljava/lang/Object;", "asPreviewProviderClass", "", "findAll", "firstOrNull", "toArray", "Lkotlin/sequences/Sequence;", "size", "(Lkotlin/sequences/Sequence;I)[Ljava/lang/Object;", "ui-tooling_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreviewUtilsKt {
    public static final Class<? extends PreviewParameterProvider<?>> asPreviewProviderClass(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Class cls = Class.forName(str);
            if (cls instanceof Class) {
                return cls;
            }
            return null;
        } catch (ClassNotFoundException e) {
            PreviewLogger.Companion companion = PreviewLogger.Companion;
            companion.logError$ui_tooling_release("Unable to find PreviewProvider '" + str + '\'', e);
            return null;
        }
    }

    public static final Object[] getPreviewProviderParameters(Class<? extends PreviewParameterProvider<?>> cls, int i) {
        if (cls != null) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                Intrinsics.checkNotNullExpressionValue(constructors, "parameterProviderClass.constructors");
                Constructor<?>[] constructorArr = constructors;
                int length = constructorArr.length;
                Constructor<?> constructor = null;
                int i2 = 0;
                boolean z = false;
                Constructor<?> constructor2 = null;
                while (true) {
                    if (i2 < length) {
                        Constructor<?> constructor3 = constructorArr[i2];
                        Class<?>[] parameterTypes = constructor3.getParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(parameterTypes, "it.parameterTypes");
                        if (parameterTypes.length == 0) {
                            if (z) {
                                break;
                            }
                            z = true;
                            constructor2 = constructor3;
                        }
                        i2++;
                    } else if (z) {
                        constructor = constructor2;
                    }
                }
                Constructor<?> constructor4 = constructor;
                if (constructor4 != null) {
                    constructor4.setAccessible(true);
                    Object newInstance = constructor4.newInstance(new Object[0]);
                    Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
                    PreviewParameterProvider previewParameterProvider = (PreviewParameterProvider) newInstance;
                    return i < 0 ? toArray(previewParameterProvider.getValues(), previewParameterProvider.getCount()) : new Object[]{SequencesKt.elementAt(previewParameterProvider.getValues(), i)};
                }
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            } catch (KotlinReflectionNotSupportedError unused) {
                throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
            }
        }
        return new Object[0];
    }

    public static final Group firstOrNull(Group group, Function1<? super Group, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(group, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return (Group) CollectionsKt.firstOrNull((List<? extends Object>) findGroupsThatMatchPredicate(group, predicate, true));
    }

    public static final List<Group> findAll(Group group, Function1<? super Group, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(group, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return findGroupsThatMatchPredicate$default(group, predicate, false, 4, null);
    }

    static /* synthetic */ List findGroupsThatMatchPredicate$default(Group group, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return findGroupsThatMatchPredicate(group, function1, z);
    }

    private static final List<Group> findGroupsThatMatchPredicate(Group group, Function1<? super Group, Boolean> function1, boolean z) {
        ArrayList arrayList = new ArrayList();
        List mutableListOf = CollectionsKt.mutableListOf(group);
        while (!mutableListOf.isEmpty()) {
            Group group2 = (Group) CollectionsKt.removeLast(mutableListOf);
            if (function1.invoke(group2).booleanValue()) {
                if (z) {
                    return CollectionsKt.listOf(group2);
                }
                arrayList.add(group2);
            }
            mutableListOf.addAll(group2.getChildren());
        }
        return arrayList;
    }

    private static final Object[] toArray(Sequence<? extends Object> sequence, int i) {
        Iterator<? extends Object> it = sequence.iterator();
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = it.next();
        }
        return objArr;
    }
}
