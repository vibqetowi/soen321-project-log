package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
/* compiled from: JsonElementSerializers.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class JsonElementSerializer$descriptor$1 extends Lambda implements Function1<ClassSerialDescriptorBuilder, Unit> {
    public static final JsonElementSerializer$descriptor$1 INSTANCE = new JsonElementSerializer$descriptor$1();

    JsonElementSerializer$descriptor$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        invoke2(classSerialDescriptorBuilder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonElementSerializers.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: kotlinx.serialization.json.JsonElementSerializer$descriptor$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<SerialDescriptor> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SerialDescriptor invoke() {
            return JsonPrimitiveSerializer.INSTANCE.getDescriptor();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonElementSerializers.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: kotlinx.serialization.json.JsonElementSerializer$descriptor$1$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2 extends Lambda implements Function0<SerialDescriptor> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SerialDescriptor invoke() {
            return JsonNullSerializer.INSTANCE.getDescriptor();
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ClassSerialDescriptorBuilder buildSerialDescriptor) {
        SerialDescriptor defer;
        SerialDescriptor defer2;
        SerialDescriptor defer3;
        SerialDescriptor defer4;
        SerialDescriptor defer5;
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        defer = JsonElementSerializersKt.defer(AnonymousClass1.INSTANCE);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonPrimitive", defer, null, false, 12, null);
        defer2 = JsonElementSerializersKt.defer(AnonymousClass2.INSTANCE);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonNull", defer2, null, false, 12, null);
        defer3 = JsonElementSerializersKt.defer(AnonymousClass3.INSTANCE);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonLiteral", defer3, null, false, 12, null);
        defer4 = JsonElementSerializersKt.defer(AnonymousClass4.INSTANCE);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonObject", defer4, null, false, 12, null);
        defer5 = JsonElementSerializersKt.defer(AnonymousClass5.INSTANCE);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonArray", defer5, null, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonElementSerializers.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: kotlinx.serialization.json.JsonElementSerializer$descriptor$1$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass3 extends Lambda implements Function0<SerialDescriptor> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SerialDescriptor invoke() {
            return JsonLiteralSerializer.INSTANCE.getDescriptor();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonElementSerializers.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: kotlinx.serialization.json.JsonElementSerializer$descriptor$1$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass4 extends Lambda implements Function0<SerialDescriptor> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SerialDescriptor invoke() {
            return JsonObjectSerializer.INSTANCE.getDescriptor();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonElementSerializers.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: kotlinx.serialization.json.JsonElementSerializer$descriptor$1$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass5 extends Lambda implements Function0<SerialDescriptor> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SerialDescriptor invoke() {
            return JsonArraySerializer.INSTANCE.getDescriptor();
        }
    }
}
