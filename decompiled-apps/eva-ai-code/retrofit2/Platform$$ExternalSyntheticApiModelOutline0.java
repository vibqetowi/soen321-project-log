package retrofit2;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.invoke.MethodHandles;
import java.nio.file.CopyOption;
import java.security.cert.PKIXRevocationChecker;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.locks.StampedLock;
import java.util.function.Supplier;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class Platform$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ UncheckedIOException m(IOException iOException) {
        return new UncheckedIOException(iOException);
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return CompletableFuture.class;
    }

    public static /* bridge */ /* synthetic */ Object m(Object obj, Supplier supplier) {
        return Objects.requireNonNull(obj, supplier);
    }

    public static /* bridge */ /* synthetic */ MethodHandles.Lookup m(Object obj) {
        return (MethodHandles.Lookup) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ CopyOption m9066m(Object obj) {
        return (CopyOption) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ PKIXRevocationChecker m9070m(Object obj) {
        return (PKIXRevocationChecker) obj;
    }

    public static /* synthetic */ StringJoiner m(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return new StringJoiner(charSequence, charSequence2, charSequence3);
    }

    /* renamed from: m */
    public static /* synthetic */ CompletableFuture m9075m() {
        return new CompletableFuture();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ CompletionException m9076m(Object obj) {
        return (CompletionException) obj;
    }

    /* renamed from: m */
    public static /* synthetic */ StampedLock m9077m() {
        return new StampedLock();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ Supplier m9078m(Object obj) {
        return (Supplier) obj;
    }

    /* renamed from: m */
    public static /* synthetic */ void m9081m() {
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m9083m(Object obj) {
        return obj instanceof CompletionException;
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return Optional.class;
    }

    /* renamed from: m$1 */
    public static /* synthetic */ void m9091m$1() {
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof PKIXRevocationChecker;
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return MethodHandles.Lookup.class;
    }
}
