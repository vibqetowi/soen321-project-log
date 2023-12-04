package com.ifriend.domain.useCases.diary;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_utils.data.Resource;
import com.ifriend.domain.models.diary.DiaryNote;
import com.ifriend.domain.models.diary.DiaryNoteModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GetDiaryNotesListUseCase.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\"\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b*\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/useCases/diary/GetDiaryNotesListUseCase;", "", "diaryNotesService", "Lcom/ifriend/domain/useCases/diary/DiaryNotesService;", "(Lcom/ifriend/domain/useCases/diary/DiaryNotesService;)V", "encodeDescription", "", "description", "getAllNotes", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/common_utils/data/Resource;", "", "Lcom/ifriend/domain/models/diary/DiaryNoteModel;", "refresh", "", "encodeUnavailableDescriptions", "Lcom/ifriend/domain/models/diary/DiaryNote;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetDiaryNotesListUseCase {
    private final DiaryNotesService diaryNotesService;

    public GetDiaryNotesListUseCase(DiaryNotesService diaryNotesService) {
        Intrinsics.checkNotNullParameter(diaryNotesService, "diaryNotesService");
        this.diaryNotesService = diaryNotesService;
    }

    public static /* synthetic */ Flow getAllNotes$default(GetDiaryNotesListUseCase getDiaryNotesListUseCase, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getDiaryNotesListUseCase.getAllNotes(z);
    }

    public final Flow<Resource<List<DiaryNoteModel>>> getAllNotes(boolean z) {
        final Flow<Resource<List<DiaryNote>>> allNotes = this.diaryNotesService.getAllNotes(z);
        return (Flow) new Flow<Resource<List<? extends DiaryNoteModel>>>() { // from class: com.ifriend.domain.useCases.diary.GetDiaryNotesListUseCase$getAllNotes$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Resource<List<? extends DiaryNoteModel>>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.domain.useCases.diary.GetDiaryNotesListUseCase$getAllNotes$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ GetDiaryNotesListUseCase this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.domain.useCases.diary.GetDiaryNotesListUseCase$getAllNotes$$inlined$map$1$2", f = "GetDiaryNotesListUseCase.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.domain.useCases.diary.GetDiaryNotesListUseCase$getAllNotes$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, GetDiaryNotesListUseCase getDiaryNotesListUseCase) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = getDiaryNotesListUseCase;
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
                    r2 = r7.this$0.encodeUnavailableDescriptions(r2);
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    Object obj2;
                    List encodeUnavailableDescriptions;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj3 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj3);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Resource resource = (Resource) obj;
                                List list = (List) resource.getData();
                                List sortedWith = (list == null || encodeUnavailableDescriptions == null) ? null : CollectionsKt.sortedWith(encodeUnavailableDescriptions, 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: TERNARY(r2v6 'sortedWith' java.util.List) = (((r2v4 'list' java.util.List) == (null java.util.List) || (r2v15 'encodeUnavailableDescriptions' java.util.List) == (null java.util.List))) ? (null java.util.List) : (wrap: java.util.List : 0x0056: INVOKE  (r2v17 'sortedWith' java.util.List A[REMOVE]) = 
                                      (r2v15 'encodeUnavailableDescriptions' java.util.List)
                                      (wrap: java.util.Comparator : 0x0051: CONSTRUCTOR  (r4v14 java.util.Comparator A[REMOVE]) =  call: com.ifriend.domain.useCases.diary.GetDiaryNotesListUseCase$getAllNotes$lambda$2$$inlined$sortedByDescending$1.<init>():void type: CONSTRUCTOR)
                                     type: STATIC call: kotlin.collections.CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List) in method: com.ifriend.domain.useCases.diary.GetDiaryNotesListUseCase$getAllNotes$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes6.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:287)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ifriend.domain.useCases.diary.GetDiaryNotesListUseCase$getAllNotes$lambda$2$$inlined$sortedByDescending$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:303)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:696)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:395)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:141)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1036)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:837)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:399)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:141)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                                    	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1083)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:513)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
                                    	... 33 more
                                    */
                                /*
                                    Method dump skipped, instructions count: 225
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ifriend.domain.useCases.diary.GetDiaryNotesListUseCase$getAllNotes$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }
                    };
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final List<DiaryNote> encodeUnavailableDescriptions(List<DiaryNote> list) {
                    List<DiaryNote> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (DiaryNote diaryNote : list2) {
                        String descriptionShort = diaryNote.getDescriptionShort();
                        if (descriptionShort == null) {
                            descriptionShort = "";
                        }
                        if (!diaryNote.isAvailable()) {
                            diaryNote = diaryNote.copy((r22 & 1) != 0 ? diaryNote.id : null, (r22 & 2) != 0 ? diaryNote.title : null, (r22 & 4) != 0 ? diaryNote.descriptionShort : null, (r22 & 8) != 0 ? diaryNote.description : encodeDescription(descriptionShort), (r22 & 16) != 0 ? diaryNote.isAvailable : false, (r22 & 32) != 0 ? diaryNote.isAnswered : false, (r22 & 64) != 0 ? diaryNote.isFree : false, (r22 & 128) != 0 ? diaryNote.timestamp : 0L, (r22 & 256) != 0 ? diaryNote.isShown : false);
                        }
                        arrayList.add(diaryNote);
                    }
                    return arrayList;
                }

                private final String encodeDescription(String str) {
                    String str2 = DiaryNote.Companion.getCodingTemplates().get(str.length() % DiaryNote.Companion.getCodingTemplates().size());
                    return str + ((Object) str2);
                }
            }
