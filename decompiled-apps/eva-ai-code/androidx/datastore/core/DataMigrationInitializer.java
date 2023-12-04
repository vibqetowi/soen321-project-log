package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: DataMigrationInitializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "Companion", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class DataMigrationInitializer<T> {
    public static final Companion Companion = new Companion(null);

    /* compiled from: DataMigrationInitializer.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JY\u0010\u0003\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00060\u0005¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\b\u0001\u0010\u00062\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u000e0\rø\u0001\u0000¢\u0006\u0002\u0010\u000fJ9\u0010\u0010\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00062\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u000e0\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer$Companion;", "", "()V", "getInitializer", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "migrations", "", "Landroidx/datastore/core/DataMigration;", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "runMigrations", "(Ljava/util/List;Landroidx/datastore/core/InitializerApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> Function2<InitializerApi<T>, Continuation<? super Unit>, Object> getInitializer(List<? extends DataMigration<T>> migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new DataMigrationInitializer$Companion$getInitializer$1(migrations, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Throwable, T] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008d -> B:25:0x0070). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0090 -> B:25:0x0070). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <T> Object runMigrations(List<? extends DataMigration<T>> list, InitializerApi<T> initializerApi, Continuation<? super Unit> continuation) {
            DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            int i;
            List list2;
            Ref.ObjectRef objectRef;
            Iterator<T> it;
            Throwable th;
            if (continuation instanceof DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) continuation;
                if ((dataMigrationInitializer$Companion$runMigrations$1.label & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.label -= Integer.MIN_VALUE;
                    Object obj = dataMigrationInitializer$Companion$runMigrations$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataMigrationInitializer$Companion$runMigrations$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ArrayList arrayList = new ArrayList();
                        dataMigrationInitializer$Companion$runMigrations$1.L$0 = arrayList;
                        dataMigrationInitializer$Companion$runMigrations$1.label = 1;
                        if (initializerApi.updateData(new DataMigrationInitializer$Companion$runMigrations$2(list, arrayList, null), dataMigrationInitializer$Companion$runMigrations$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list2 = arrayList;
                    } else if (i != 1) {
                        if (i == 2) {
                            it = (Iterator) dataMigrationInitializer$Companion$runMigrations$1.L$1;
                            objectRef = (Ref.ObjectRef) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (Throwable r9) {
                                r9 = (T) th;
                                if (objectRef.element == null) {
                                    objectRef.element = r9;
                                } else {
                                    Intrinsics.checkNotNull(objectRef.element);
                                    ExceptionsKt.addSuppressed((Throwable) objectRef.element, r9);
                                }
                            }
                            while (it.hasNext()) {
                                Function1 function1 = (Function1) it.next();
                                dataMigrationInitializer$Companion$runMigrations$1.L$0 = objectRef;
                                dataMigrationInitializer$Companion$runMigrations$1.L$1 = it;
                                dataMigrationInitializer$Companion$runMigrations$1.label = 2;
                                if (function1.invoke(dataMigrationInitializer$Companion$runMigrations$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            th = (Throwable) objectRef.element;
                            if (th != null) {
                                throw th;
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    objectRef = new Ref.ObjectRef();
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    th = (Throwable) objectRef.element;
                    if (th != null) {
                    }
                }
            }
            dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(this, continuation);
            Object obj2 = dataMigrationInitializer$Companion$runMigrations$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = dataMigrationInitializer$Companion$runMigrations$1.label;
            if (i != 0) {
            }
            objectRef = new Ref.ObjectRef();
            it = list2.iterator();
            while (it.hasNext()) {
            }
            th = (Throwable) objectRef.element;
            if (th != null) {
            }
        }
    }
}
