package com.google.protobuf.util;

import com.facebook.GraphRequest;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.security.CertificateUtil;
import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.protobuf.Any;
import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.BytesValue;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Duration;
import com.google.protobuf.DynamicMessage;
import com.google.protobuf.FieldMask;
import com.google.protobuf.FloatValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ListValue;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.NullValue;
import com.google.protobuf.StringValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt64Value;
import com.google.protobuf.Value;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* loaded from: classes6.dex */
public class JsonFormat {
    private static final Logger logger = Logger.getLogger(JsonFormat.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface TextGenerator {
        void indent();

        void outdent();

        void print(CharSequence charSequence) throws IOException;
    }

    private JsonFormat() {
    }

    public static Printer printer() {
        return new Printer(com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(), TypeRegistry.getEmptyTypeRegistry(), false, Collections.emptySet(), false, false, false, false, null);
    }

    /* loaded from: classes6.dex */
    public static class Printer {
        private boolean alwaysOutputDefaultValueFields;
        private Set<Descriptors.FieldDescriptor> includingDefaultValueFields;
        private final TypeRegistry oldRegistry;
        private final boolean omittingInsignificantWhitespace;
        private final boolean preservingProtoFieldNames;
        private final boolean printingEnumsAsInts;
        private final com.google.protobuf.TypeRegistry registry;
        private final boolean sortingMapKeys;

        /* synthetic */ Printer(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z, Set set, boolean z2, boolean z3, boolean z4, boolean z5, AnonymousClass1 anonymousClass1) {
            this(typeRegistry, typeRegistry2, z, set, z2, z3, z4, z5);
        }

        private Printer(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z, Set<Descriptors.FieldDescriptor> set, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.registry = typeRegistry;
            this.oldRegistry = typeRegistry2;
            this.alwaysOutputDefaultValueFields = z;
            this.includingDefaultValueFields = set;
            this.preservingProtoFieldNames = z2;
            this.omittingInsignificantWhitespace = z3;
            this.printingEnumsAsInts = z4;
            this.sortingMapKeys = z5;
        }

        public Printer usingTypeRegistry(TypeRegistry typeRegistry) {
            if (this.oldRegistry != TypeRegistry.getEmptyTypeRegistry() || this.registry != com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
                throw new IllegalArgumentException("Only one registry is allowed.");
            }
            return new Printer(com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(), typeRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
        }

        public Printer usingTypeRegistry(com.google.protobuf.TypeRegistry typeRegistry) {
            if (this.oldRegistry != TypeRegistry.getEmptyTypeRegistry() || this.registry != com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
                throw new IllegalArgumentException("Only one registry is allowed.");
            }
            return new Printer(typeRegistry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
        }

        public Printer includingDefaultValueFields() {
            checkUnsetIncludingDefaultValueFields();
            return new Printer(this.registry, this.oldRegistry, true, Collections.emptySet(), this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
        }

        public Printer printingEnumsAsInts() {
            checkUnsetPrintingEnumsAsInts();
            return new Printer(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, true, this.sortingMapKeys);
        }

        private void checkUnsetPrintingEnumsAsInts() {
            if (this.printingEnumsAsInts) {
                throw new IllegalStateException("JsonFormat printingEnumsAsInts has already been set.");
            }
        }

        public Printer includingDefaultValueFields(Set<Descriptors.FieldDescriptor> set) {
            Preconditions.checkArgument((set == null || set.isEmpty()) ? false : true, "Non-empty Set must be supplied for includingDefaultValueFields.");
            checkUnsetIncludingDefaultValueFields();
            return new Printer(this.registry, this.oldRegistry, false, Collections.unmodifiableSet(new HashSet(set)), this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
        }

        private void checkUnsetIncludingDefaultValueFields() {
            if (this.alwaysOutputDefaultValueFields || !this.includingDefaultValueFields.isEmpty()) {
                throw new IllegalStateException("JsonFormat includingDefaultValueFields has already been set.");
            }
        }

        public Printer preservingProtoFieldNames() {
            return new Printer(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, true, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
        }

        public Printer omittingInsignificantWhitespace() {
            return new Printer(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, true, this.printingEnumsAsInts, this.sortingMapKeys);
        }

        public Printer sortingMapKeys() {
            return new Printer(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, true);
        }

        public void appendTo(MessageOrBuilder messageOrBuilder, Appendable appendable) throws IOException {
            new PrinterImpl(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, appendable, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys).print(messageOrBuilder);
        }

        public String print(MessageOrBuilder messageOrBuilder) throws InvalidProtocolBufferException {
            try {
                StringBuilder sb = new StringBuilder();
                appendTo(messageOrBuilder, sb);
                return sb.toString();
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    public static Parser parser() {
        return new Parser(com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(), TypeRegistry.getEmptyTypeRegistry(), false, 100, null);
    }

    /* loaded from: classes6.dex */
    public static class Parser {
        private static final int DEFAULT_RECURSION_LIMIT = 100;
        private final boolean ignoringUnknownFields;
        private final TypeRegistry oldRegistry;
        private final int recursionLimit;
        private final com.google.protobuf.TypeRegistry registry;

        /* synthetic */ Parser(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z, int i, AnonymousClass1 anonymousClass1) {
            this(typeRegistry, typeRegistry2, z, i);
        }

        private Parser(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z, int i) {
            this.registry = typeRegistry;
            this.oldRegistry = typeRegistry2;
            this.ignoringUnknownFields = z;
            this.recursionLimit = i;
        }

        public Parser usingTypeRegistry(TypeRegistry typeRegistry) {
            if (this.oldRegistry != TypeRegistry.getEmptyTypeRegistry() || this.registry != com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
                throw new IllegalArgumentException("Only one registry is allowed.");
            }
            return new Parser(com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(), typeRegistry, this.ignoringUnknownFields, this.recursionLimit);
        }

        public Parser usingTypeRegistry(com.google.protobuf.TypeRegistry typeRegistry) {
            if (this.oldRegistry != TypeRegistry.getEmptyTypeRegistry() || this.registry != com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
                throw new IllegalArgumentException("Only one registry is allowed.");
            }
            return new Parser(typeRegistry, this.oldRegistry, this.ignoringUnknownFields, this.recursionLimit);
        }

        public Parser ignoringUnknownFields() {
            return new Parser(this.registry, this.oldRegistry, true, this.recursionLimit);
        }

        public void merge(String str, Message.Builder builder) throws InvalidProtocolBufferException {
            new ParserImpl(this.registry, this.oldRegistry, this.ignoringUnknownFields, this.recursionLimit).merge(str, builder);
        }

        public void merge(Reader reader, Message.Builder builder) throws IOException {
            new ParserImpl(this.registry, this.oldRegistry, this.ignoringUnknownFields, this.recursionLimit).merge(reader, builder);
        }

        Parser usingRecursionLimit(int i) {
            return new Parser(this.registry, this.oldRegistry, this.ignoringUnknownFields, i);
        }
    }

    /* loaded from: classes6.dex */
    public static class TypeRegistry {
        private final Map<String, Descriptors.Descriptor> types;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static class EmptyTypeRegistryHolder {
            private static final TypeRegistry EMPTY = new TypeRegistry(Collections.emptyMap(), null);

            private EmptyTypeRegistryHolder() {
            }
        }

        /* synthetic */ TypeRegistry(Map map, AnonymousClass1 anonymousClass1) {
            this(map);
        }

        public static TypeRegistry getEmptyTypeRegistry() {
            return EmptyTypeRegistryHolder.EMPTY;
        }

        public static Builder newBuilder() {
            return new Builder(null);
        }

        public Descriptors.Descriptor find(String str) {
            return this.types.get(str);
        }

        Descriptors.Descriptor getDescriptorForTypeUrl(String str) throws InvalidProtocolBufferException {
            return find(JsonFormat.getTypeName(str));
        }

        private TypeRegistry(Map<String, Descriptors.Descriptor> map) {
            this.types = map;
        }

        /* loaded from: classes6.dex */
        public static class Builder {
            private final Set<String> files;
            private Map<String, Descriptors.Descriptor> types;

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.files = new HashSet();
                this.types = new HashMap();
            }

            public Builder add(Descriptors.Descriptor descriptor) {
                if (this.types == null) {
                    throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
                }
                addFile(descriptor.getFile());
                return this;
            }

            public Builder add(Iterable<Descriptors.Descriptor> iterable) {
                if (this.types == null) {
                    throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
                }
                for (Descriptors.Descriptor descriptor : iterable) {
                    addFile(descriptor.getFile());
                }
                return this;
            }

            public TypeRegistry build() {
                TypeRegistry typeRegistry = new TypeRegistry(this.types, null);
                this.types = null;
                return typeRegistry;
            }

            private void addFile(Descriptors.FileDescriptor fileDescriptor) {
                if (this.files.add(fileDescriptor.getFullName())) {
                    for (Descriptors.FileDescriptor fileDescriptor2 : fileDescriptor.getDependencies()) {
                        addFile(fileDescriptor2);
                    }
                    for (Descriptors.Descriptor descriptor : fileDescriptor.getMessageTypes()) {
                        addMessage(descriptor);
                    }
                }
            }

            private void addMessage(Descriptors.Descriptor descriptor) {
                for (Descriptors.Descriptor descriptor2 : descriptor.getNestedTypes()) {
                    addMessage(descriptor2);
                }
                if (this.types.containsKey(descriptor.getFullName())) {
                    Logger logger = JsonFormat.logger;
                    logger.warning("Type " + descriptor.getFullName() + " is added multiple times.");
                    return;
                }
                this.types.put(descriptor.getFullName(), descriptor);
            }
        }
    }

    /* loaded from: classes6.dex */
    private static final class CompactTextGenerator implements TextGenerator {
        private final Appendable output;

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void indent() {
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void outdent() {
        }

        /* synthetic */ CompactTextGenerator(Appendable appendable, AnonymousClass1 anonymousClass1) {
            this(appendable);
        }

        private CompactTextGenerator(Appendable appendable) {
            this.output = appendable;
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void print(CharSequence charSequence) throws IOException {
            this.output.append(charSequence);
        }
    }

    /* loaded from: classes6.dex */
    private static final class PrettyTextGenerator implements TextGenerator {
        private boolean atStartOfLine;
        private final StringBuilder indent;
        private final Appendable output;

        /* synthetic */ PrettyTextGenerator(Appendable appendable, AnonymousClass1 anonymousClass1) {
            this(appendable);
        }

        private PrettyTextGenerator(Appendable appendable) {
            this.indent = new StringBuilder();
            this.atStartOfLine = true;
            this.output = appendable;
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void indent() {
            this.indent.append("  ");
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void outdent() {
            int length = this.indent.length();
            if (length < 2) {
                throw new IllegalArgumentException(" Outdent() without matching Indent().");
            }
            this.indent.delete(length - 2, length);
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void print(CharSequence charSequence) throws IOException {
            int length = charSequence.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (charSequence.charAt(i2) == '\n') {
                    int i3 = i2 + 1;
                    write(charSequence.subSequence(i, i3));
                    this.atStartOfLine = true;
                    i = i3;
                }
            }
            write(charSequence.subSequence(i, length));
        }

        private void write(CharSequence charSequence) throws IOException {
            if (charSequence.length() == 0) {
                return;
            }
            if (this.atStartOfLine) {
                this.atStartOfLine = false;
                this.output.append(this.indent);
            }
            this.output.append(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class PrinterImpl {
        private static final Map<String, WellKnownTypePrinter> wellKnownTypePrinters = buildWellKnownTypePrinters();
        private final boolean alwaysOutputDefaultValueFields;
        private final CharSequence blankOrNewLine;
        private final CharSequence blankOrSpace;
        private final TextGenerator generator;
        private final Gson gson = GsonHolder.DEFAULT_GSON;
        private final Set<Descriptors.FieldDescriptor> includingDefaultValueFields;
        private final TypeRegistry oldRegistry;
        private final boolean preservingProtoFieldNames;
        private final boolean printingEnumsAsInts;
        private final com.google.protobuf.TypeRegistry registry;
        private final boolean sortingMapKeys;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public interface WellKnownTypePrinter {
            void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) throws IOException;
        }

        /* loaded from: classes6.dex */
        private static class GsonHolder {
            private static final Gson DEFAULT_GSON = new GsonBuilder().create();

            private GsonHolder() {
            }
        }

        PrinterImpl(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z, Set<Descriptors.FieldDescriptor> set, boolean z2, Appendable appendable, boolean z3, boolean z4, boolean z5) {
            this.registry = typeRegistry;
            this.oldRegistry = typeRegistry2;
            this.alwaysOutputDefaultValueFields = z;
            this.includingDefaultValueFields = set;
            this.preservingProtoFieldNames = z2;
            this.printingEnumsAsInts = z4;
            this.sortingMapKeys = z5;
            if (z3) {
                this.generator = new CompactTextGenerator(appendable, null);
                this.blankOrSpace = "";
                this.blankOrNewLine = "";
                return;
            }
            this.generator = new PrettyTextGenerator(appendable, null);
            this.blankOrSpace = " ";
            this.blankOrNewLine = "\n";
        }

        void print(MessageOrBuilder messageOrBuilder) throws IOException {
            WellKnownTypePrinter wellKnownTypePrinter = wellKnownTypePrinters.get(messageOrBuilder.getDescriptorForType().getFullName());
            if (wellKnownTypePrinter != null) {
                wellKnownTypePrinter.print(this, messageOrBuilder);
            } else {
                print(messageOrBuilder, null);
            }
        }

        private static Map<String, WellKnownTypePrinter> buildWellKnownTypePrinters() {
            HashMap hashMap = new HashMap();
            hashMap.put(Any.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.1
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) throws IOException {
                    printerImpl.printAny(messageOrBuilder);
                }
            });
            WellKnownTypePrinter wellKnownTypePrinter = new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.2
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) throws IOException {
                    printerImpl.printWrapper(messageOrBuilder);
                }
            };
            hashMap.put(BoolValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(Int32Value.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(UInt32Value.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(Int64Value.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(UInt64Value.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(StringValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(BytesValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(FloatValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(DoubleValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(Timestamp.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.3
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) throws IOException {
                    printerImpl.printTimestamp(messageOrBuilder);
                }
            });
            hashMap.put(Duration.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.4
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) throws IOException {
                    printerImpl.printDuration(messageOrBuilder);
                }
            });
            hashMap.put(FieldMask.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.5
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) throws IOException {
                    printerImpl.printFieldMask(messageOrBuilder);
                }
            });
            hashMap.put(Struct.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.6
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) throws IOException {
                    printerImpl.printStruct(messageOrBuilder);
                }
            });
            hashMap.put(Value.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.7
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) throws IOException {
                    printerImpl.printValue(messageOrBuilder);
                }
            });
            hashMap.put(ListValue.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.8
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) throws IOException {
                    printerImpl.printListValue(messageOrBuilder);
                }
            });
            return hashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printAny(MessageOrBuilder messageOrBuilder) throws IOException {
            if (Any.getDefaultInstance().equals(messageOrBuilder)) {
                this.generator.print("{}");
                return;
            }
            Descriptors.Descriptor descriptorForType = messageOrBuilder.getDescriptorForType();
            Descriptors.FieldDescriptor findFieldByName = descriptorForType.findFieldByName("type_url");
            Descriptors.FieldDescriptor findFieldByName2 = descriptorForType.findFieldByName("value");
            if (findFieldByName == null || findFieldByName2 == null || findFieldByName.getType() != Descriptors.FieldDescriptor.Type.STRING || findFieldByName2.getType() != Descriptors.FieldDescriptor.Type.BYTES) {
                throw new InvalidProtocolBufferException("Invalid Any type.");
            }
            String str = (String) messageOrBuilder.getField(findFieldByName);
            Descriptors.Descriptor descriptorForTypeUrl = this.registry.getDescriptorForTypeUrl(str);
            if (descriptorForTypeUrl == null && (descriptorForTypeUrl = this.oldRegistry.getDescriptorForTypeUrl(str)) == null) {
                throw new InvalidProtocolBufferException("Cannot find type for url: " + str);
            }
            DynamicMessage parseFrom = DynamicMessage.getDefaultInstance(descriptorForTypeUrl).getParserForType().parseFrom((ByteString) messageOrBuilder.getField(findFieldByName2));
            WellKnownTypePrinter wellKnownTypePrinter = wellKnownTypePrinters.get(JsonFormat.getTypeName(str));
            if (wellKnownTypePrinter != null) {
                TextGenerator textGenerator = this.generator;
                textGenerator.print("{" + ((Object) this.blankOrNewLine));
                this.generator.indent();
                TextGenerator textGenerator2 = this.generator;
                textGenerator2.print("\"@type\":" + ((Object) this.blankOrSpace) + this.gson.toJson(str) + "," + ((Object) this.blankOrNewLine));
                TextGenerator textGenerator3 = this.generator;
                StringBuilder sb = new StringBuilder("\"value\":");
                sb.append((Object) this.blankOrSpace);
                textGenerator3.print(sb.toString());
                wellKnownTypePrinter.print(this, parseFrom);
                this.generator.print(this.blankOrNewLine);
                this.generator.outdent();
                this.generator.print("}");
                return;
            }
            print(parseFrom, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printWrapper(MessageOrBuilder messageOrBuilder) throws IOException {
            Descriptors.FieldDescriptor findFieldByName = messageOrBuilder.getDescriptorForType().findFieldByName("value");
            if (findFieldByName == null) {
                throw new InvalidProtocolBufferException("Invalid Wrapper type.");
            }
            printSingleFieldValue(findFieldByName, messageOrBuilder.getField(findFieldByName));
        }

        private ByteString toByteString(MessageOrBuilder messageOrBuilder) {
            if (messageOrBuilder instanceof Message) {
                return ((Message) messageOrBuilder).toByteString();
            }
            return ((Message.Builder) messageOrBuilder).build().toByteString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printTimestamp(MessageOrBuilder messageOrBuilder) throws IOException {
            Timestamp parseFrom = Timestamp.parseFrom(toByteString(messageOrBuilder));
            TextGenerator textGenerator = this.generator;
            textGenerator.print("\"" + Timestamps.toString(parseFrom) + "\"");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printDuration(MessageOrBuilder messageOrBuilder) throws IOException {
            Duration parseFrom = Duration.parseFrom(toByteString(messageOrBuilder));
            TextGenerator textGenerator = this.generator;
            textGenerator.print("\"" + Durations.toString(parseFrom) + "\"");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printFieldMask(MessageOrBuilder messageOrBuilder) throws IOException {
            FieldMask parseFrom = FieldMask.parseFrom(toByteString(messageOrBuilder));
            TextGenerator textGenerator = this.generator;
            textGenerator.print("\"" + FieldMaskUtil.toJsonString(parseFrom) + "\"");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printStruct(MessageOrBuilder messageOrBuilder) throws IOException {
            Descriptors.FieldDescriptor findFieldByName = messageOrBuilder.getDescriptorForType().findFieldByName(GraphRequest.FIELDS_PARAM);
            if (findFieldByName == null) {
                throw new InvalidProtocolBufferException("Invalid Struct type.");
            }
            printMapFieldValue(findFieldByName, messageOrBuilder.getField(findFieldByName));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printValue(MessageOrBuilder messageOrBuilder) throws IOException {
            Map<Descriptors.FieldDescriptor, Object> allFields = messageOrBuilder.getAllFields();
            if (allFields.isEmpty()) {
                this.generator.print(AbstractJsonLexerKt.NULL);
            } else if (allFields.size() != 1) {
                throw new InvalidProtocolBufferException("Invalid Value type.");
            } else {
                for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : allFields.entrySet()) {
                    printSingleFieldValue(entry.getKey(), entry.getValue());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printListValue(MessageOrBuilder messageOrBuilder) throws IOException {
            Descriptors.FieldDescriptor findFieldByName = messageOrBuilder.getDescriptorForType().findFieldByName("values");
            if (findFieldByName == null) {
                throw new InvalidProtocolBufferException("Invalid ListValue type.");
            }
            printRepeatedFieldValue(findFieldByName, messageOrBuilder.getField(findFieldByName));
        }

        private void print(MessageOrBuilder messageOrBuilder, String str) throws IOException {
            boolean z;
            Map<Descriptors.FieldDescriptor, Object> map;
            this.generator.print("{" + ((Object) this.blankOrNewLine));
            this.generator.indent();
            if (str != null) {
                this.generator.print("\"@type\":" + ((Object) this.blankOrSpace) + this.gson.toJson(str));
                z = true;
            } else {
                z = false;
            }
            if (this.alwaysOutputDefaultValueFields || !this.includingDefaultValueFields.isEmpty()) {
                TreeMap treeMap = new TreeMap(messageOrBuilder.getAllFields());
                for (Descriptors.FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
                    if (fieldDescriptor.isOptional()) {
                        if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE || messageOrBuilder.hasField(fieldDescriptor)) {
                            if (fieldDescriptor.getContainingOneof() != null && !messageOrBuilder.hasField(fieldDescriptor)) {
                            }
                        }
                    }
                    if (!treeMap.containsKey(fieldDescriptor) && (this.alwaysOutputDefaultValueFields || this.includingDefaultValueFields.contains(fieldDescriptor))) {
                        treeMap.put(fieldDescriptor, messageOrBuilder.getField(fieldDescriptor));
                    }
                }
                map = treeMap;
            } else {
                map = messageOrBuilder.getAllFields();
            }
            for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
                if (z) {
                    this.generator.print("," + ((Object) this.blankOrNewLine));
                } else {
                    z = true;
                }
                printField(entry.getKey(), entry.getValue());
            }
            if (z) {
                this.generator.print(this.blankOrNewLine);
            }
            this.generator.outdent();
            this.generator.print("}");
        }

        private void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) throws IOException {
            if (this.preservingProtoFieldNames) {
                TextGenerator textGenerator = this.generator;
                textGenerator.print("\"" + fieldDescriptor.getName() + "\":" + ((Object) this.blankOrSpace));
            } else {
                TextGenerator textGenerator2 = this.generator;
                textGenerator2.print("\"" + fieldDescriptor.getJsonName() + "\":" + ((Object) this.blankOrSpace));
            }
            if (fieldDescriptor.isMapField()) {
                printMapFieldValue(fieldDescriptor, obj);
            } else if (fieldDescriptor.isRepeated()) {
                printRepeatedFieldValue(fieldDescriptor, obj);
            } else {
                printSingleFieldValue(fieldDescriptor, obj);
            }
        }

        private void printRepeatedFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj) throws IOException {
            this.generator.print("[");
            boolean z = false;
            for (Object obj2 : (List) obj) {
                if (z) {
                    TextGenerator textGenerator = this.generator;
                    textGenerator.print("," + ((Object) this.blankOrSpace));
                } else {
                    z = true;
                }
                printSingleFieldValue(fieldDescriptor, obj2);
            }
            this.generator.print("]");
        }

        private void printMapFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj) throws IOException {
            Descriptors.Descriptor messageType = fieldDescriptor.getMessageType();
            Descriptors.FieldDescriptor findFieldByName = messageType.findFieldByName("key");
            Descriptors.FieldDescriptor findFieldByName2 = messageType.findFieldByName("value");
            if (findFieldByName == null || findFieldByName2 == null) {
                throw new InvalidProtocolBufferException("Invalid map field.");
            }
            this.generator.print("{" + ((Object) this.blankOrNewLine));
            this.generator.indent();
            Collection<Message> collection = (List) obj;
            if (this.sortingMapKeys && !collection.isEmpty()) {
                TreeMap treeMap = new TreeMap(findFieldByName.getType() == Descriptors.FieldDescriptor.Type.STRING ? new Comparator<Object>() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.9
                    @Override // java.util.Comparator
                    public int compare(Object obj2, Object obj3) {
                        return ByteString.unsignedLexicographicalComparator().compare(ByteString.copyFromUtf8((String) obj2), ByteString.copyFromUtf8((String) obj3));
                    }
                } : null);
                for (Object obj2 : collection) {
                    treeMap.put(((Message) obj2).getField(findFieldByName), obj2);
                }
                collection = treeMap.values();
            }
            boolean z = false;
            for (Message message : collection) {
                Object field = message.getField(findFieldByName);
                Object field2 = message.getField(findFieldByName2);
                if (z) {
                    this.generator.print("," + ((Object) this.blankOrNewLine));
                } else {
                    z = true;
                }
                printSingleFieldValue(findFieldByName, field, true);
                this.generator.print(CertificateUtil.DELIMITER + ((Object) this.blankOrSpace));
                printSingleFieldValue(findFieldByName2, field2);
            }
            if (z) {
                this.generator.print(this.blankOrNewLine);
            }
            this.generator.outdent();
            this.generator.print("}");
        }

        private void printSingleFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj) throws IOException {
            printSingleFieldValue(fieldDescriptor, obj, false);
        }

        private void printSingleFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    if (z) {
                        this.generator.print("\"");
                    }
                    this.generator.print(((Integer) obj).toString());
                    if (z) {
                        this.generator.print("\"");
                        return;
                    }
                    return;
                case 4:
                case 5:
                case 6:
                    TextGenerator textGenerator = this.generator;
                    textGenerator.print("\"" + ((Long) obj).toString() + "\"");
                    return;
                case 7:
                    if (z) {
                        this.generator.print("\"");
                    }
                    if (((Boolean) obj).booleanValue()) {
                        this.generator.print(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                    } else {
                        this.generator.print("false");
                    }
                    if (z) {
                        this.generator.print("\"");
                        return;
                    }
                    return;
                case 8:
                    Float f = (Float) obj;
                    if (f.isNaN()) {
                        this.generator.print("\"NaN\"");
                        return;
                    } else if (f.isInfinite()) {
                        if (f.floatValue() < 0.0f) {
                            this.generator.print("\"-Infinity\"");
                            return;
                        } else {
                            this.generator.print("\"Infinity\"");
                            return;
                        }
                    } else {
                        if (z) {
                            this.generator.print("\"");
                        }
                        this.generator.print(f.toString());
                        if (z) {
                            this.generator.print("\"");
                            return;
                        }
                        return;
                    }
                case 9:
                    Double d = (Double) obj;
                    if (d.isNaN()) {
                        this.generator.print("\"NaN\"");
                        return;
                    } else if (d.isInfinite()) {
                        if (d.doubleValue() < 0.0d) {
                            this.generator.print("\"-Infinity\"");
                            return;
                        } else {
                            this.generator.print("\"Infinity\"");
                            return;
                        }
                    } else {
                        if (z) {
                            this.generator.print("\"");
                        }
                        this.generator.print(d.toString());
                        if (z) {
                            this.generator.print("\"");
                            return;
                        }
                        return;
                    }
                case 10:
                case 11:
                    if (z) {
                        this.generator.print("\"");
                    }
                    this.generator.print(JsonFormat.unsignedToString(((Integer) obj).intValue()));
                    if (z) {
                        this.generator.print("\"");
                        return;
                    }
                    return;
                case 12:
                case 13:
                    TextGenerator textGenerator2 = this.generator;
                    textGenerator2.print("\"" + JsonFormat.unsignedToString(((Long) obj).longValue()) + "\"");
                    return;
                case 14:
                    this.generator.print(this.gson.toJson(obj));
                    return;
                case 15:
                    this.generator.print("\"");
                    this.generator.print(BaseEncoding.base64().encode(((ByteString) obj).toByteArray()));
                    this.generator.print("\"");
                    return;
                case 16:
                    if (fieldDescriptor.getEnumType().getFullName().equals("google.protobuf.NullValue")) {
                        if (z) {
                            this.generator.print("\"");
                        }
                        this.generator.print(AbstractJsonLexerKt.NULL);
                        if (z) {
                            this.generator.print("\"");
                            return;
                        }
                        return;
                    }
                    if (!this.printingEnumsAsInts) {
                        Descriptors.EnumValueDescriptor enumValueDescriptor = (Descriptors.EnumValueDescriptor) obj;
                        if (enumValueDescriptor.getIndex() != -1) {
                            TextGenerator textGenerator3 = this.generator;
                            textGenerator3.print("\"" + enumValueDescriptor.getName() + "\"");
                            return;
                        }
                    }
                    this.generator.print(String.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                    return;
                case 17:
                case 18:
                    print((Message) obj);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.util.JsonFormat$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.INT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SINT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SFIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.DOUBLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String unsignedToString(int i) {
        if (i >= 0) {
            return Integer.toString(i);
        }
        return Long.toString(i & 4294967295L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String unsignedToString(long j) {
        if (j >= 0) {
            return Long.toString(j);
        }
        return BigInteger.valueOf(j & Long.MAX_VALUE).setBit(63).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getTypeName(String str) throws InvalidProtocolBufferException {
        String[] split = str.split(RemoteSettings.FORWARD_SLASH_STRING);
        if (split.length == 1) {
            throw new InvalidProtocolBufferException("Invalid type url found: " + str);
        }
        return split[split.length - 1];
    }

    /* loaded from: classes6.dex */
    private static class ParserImpl {
        private static final double EPSILON = 1.0E-6d;
        private static final BigDecimal MAX_DOUBLE;
        private static final BigDecimal MIN_DOUBLE;
        private static final BigDecimal MORE_THAN_ONE;
        private final boolean ignoringUnknownFields;
        private final TypeRegistry oldRegistry;
        private final int recursionLimit;
        private final com.google.protobuf.TypeRegistry registry;
        private static final Map<String, WellKnownTypeParser> wellKnownTypeParsers = buildWellKnownTypeParsers();
        private static final BigInteger MAX_UINT64 = new BigInteger("FFFFFFFFFFFFFFFF", 16);
        private final Map<Descriptors.Descriptor, Map<String, Descriptors.FieldDescriptor>> fieldNameMaps = new HashMap();
        private final JsonParser jsonParser = new JsonParser();
        private int currentDepth = 0;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public interface WellKnownTypeParser {
            void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException;
        }

        ParserImpl(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z, int i) {
            this.registry = typeRegistry;
            this.oldRegistry = typeRegistry2;
            this.ignoringUnknownFields = z;
            this.recursionLimit = i;
        }

        void merge(Reader reader, Message.Builder builder) throws IOException {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                jsonReader.setLenient(false);
                merge(this.jsonParser.parse(jsonReader), builder);
            } catch (JsonIOException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw new InvalidProtocolBufferException(e.getMessage());
            } catch (InvalidProtocolBufferException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new InvalidProtocolBufferException(e3.getMessage());
            }
        }

        void merge(String str, Message.Builder builder) throws InvalidProtocolBufferException {
            try {
                JsonReader jsonReader = new JsonReader(new StringReader(str));
                jsonReader.setLenient(false);
                merge(this.jsonParser.parse(jsonReader), builder);
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (Exception e2) {
                throw new InvalidProtocolBufferException(e2.getMessage());
            }
        }

        static {
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(1.000001d));
            MORE_THAN_ONE = bigDecimal;
            MAX_DOUBLE = new BigDecimal(String.valueOf(Double.MAX_VALUE)).multiply(bigDecimal);
            MIN_DOUBLE = new BigDecimal(String.valueOf(-1.7976931348623157E308d)).multiply(bigDecimal);
        }

        private static Map<String, WellKnownTypeParser> buildWellKnownTypeParsers() {
            HashMap hashMap = new HashMap();
            hashMap.put(Any.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.1
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeAny(jsonElement, builder);
                }
            });
            WellKnownTypeParser wellKnownTypeParser = new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.2
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeWrapper(jsonElement, builder);
                }
            };
            hashMap.put(BoolValue.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(Int32Value.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(UInt32Value.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(Int64Value.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(UInt64Value.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(StringValue.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(BytesValue.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(FloatValue.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(DoubleValue.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(Timestamp.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.3
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeTimestamp(jsonElement, builder);
                }
            });
            hashMap.put(Duration.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.4
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeDuration(jsonElement, builder);
                }
            });
            hashMap.put(FieldMask.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.5
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeFieldMask(jsonElement, builder);
                }
            });
            hashMap.put(Struct.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.6
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeStruct(jsonElement, builder);
                }
            });
            hashMap.put(ListValue.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.7
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeListValue(jsonElement, builder);
                }
            });
            hashMap.put(Value.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.8
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeValue(jsonElement, builder);
                }
            });
            return hashMap;
        }

        private void merge(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            WellKnownTypeParser wellKnownTypeParser = wellKnownTypeParsers.get(builder.getDescriptorForType().getFullName());
            if (wellKnownTypeParser != null) {
                wellKnownTypeParser.merge(this, jsonElement, builder);
            } else {
                mergeMessage(jsonElement, builder, false);
            }
        }

        private Map<String, Descriptors.FieldDescriptor> getFieldNameMap(Descriptors.Descriptor descriptor) {
            if (!this.fieldNameMaps.containsKey(descriptor)) {
                HashMap hashMap = new HashMap();
                for (Descriptors.FieldDescriptor fieldDescriptor : descriptor.getFields()) {
                    hashMap.put(fieldDescriptor.getName(), fieldDescriptor);
                    hashMap.put(fieldDescriptor.getJsonName(), fieldDescriptor);
                }
                this.fieldNameMaps.put(descriptor, hashMap);
                return hashMap;
            }
            return this.fieldNameMaps.get(descriptor);
        }

        private void mergeMessage(JsonElement jsonElement, Message.Builder builder, boolean z) throws InvalidProtocolBufferException {
            if (!(jsonElement instanceof JsonObject)) {
                throw new InvalidProtocolBufferException("Expect message object but got: " + jsonElement);
            }
            Map<String, Descriptors.FieldDescriptor> fieldNameMap = getFieldNameMap(builder.getDescriptorForType());
            for (Map.Entry<String, JsonElement> entry : ((JsonObject) jsonElement).entrySet()) {
                if (!z || !entry.getKey().equals("@type")) {
                    Descriptors.FieldDescriptor fieldDescriptor = fieldNameMap.get(entry.getKey());
                    if (fieldDescriptor == null) {
                        if (!this.ignoringUnknownFields) {
                            throw new InvalidProtocolBufferException("Cannot find field: " + entry.getKey() + " in message " + builder.getDescriptorForType().getFullName());
                        }
                    } else {
                        mergeField(fieldDescriptor, entry.getValue(), builder);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAny(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            Descriptors.Descriptor descriptorForType = builder.getDescriptorForType();
            Descriptors.FieldDescriptor findFieldByName = descriptorForType.findFieldByName("type_url");
            Descriptors.FieldDescriptor findFieldByName2 = descriptorForType.findFieldByName("value");
            if (findFieldByName == null || findFieldByName2 == null || findFieldByName.getType() != Descriptors.FieldDescriptor.Type.STRING || findFieldByName2.getType() != Descriptors.FieldDescriptor.Type.BYTES) {
                throw new InvalidProtocolBufferException("Invalid Any type.");
            }
            if (!(jsonElement instanceof JsonObject)) {
                throw new InvalidProtocolBufferException("Expect message object but got: " + jsonElement);
            }
            JsonObject jsonObject = (JsonObject) jsonElement;
            if (jsonObject.entrySet().isEmpty()) {
                return;
            }
            JsonElement jsonElement2 = jsonObject.get("@type");
            if (jsonElement2 == null) {
                throw new InvalidProtocolBufferException("Missing type url when parsing: " + jsonElement);
            }
            String asString = jsonElement2.getAsString();
            Descriptors.Descriptor descriptorForTypeUrl = this.registry.getDescriptorForTypeUrl(asString);
            if (descriptorForTypeUrl == null && (descriptorForTypeUrl = this.oldRegistry.getDescriptorForTypeUrl(asString)) == null) {
                throw new InvalidProtocolBufferException("Cannot resolve type: " + asString);
            }
            builder.setField(findFieldByName, asString);
            DynamicMessage.Builder newBuilderForType = DynamicMessage.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
            WellKnownTypeParser wellKnownTypeParser = wellKnownTypeParsers.get(descriptorForTypeUrl.getFullName());
            if (wellKnownTypeParser != null) {
                JsonElement jsonElement3 = jsonObject.get("value");
                if (jsonElement3 != null) {
                    wellKnownTypeParser.merge(this, jsonElement3, newBuilderForType);
                }
            } else {
                mergeMessage(jsonElement, newBuilderForType, true);
            }
            builder.setField(findFieldByName2, newBuilderForType.build().toByteString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFieldMask(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            builder.mergeFrom(FieldMaskUtil.fromJsonString(jsonElement.getAsString()).toByteString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamp(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            try {
                builder.mergeFrom(Timestamps.parse(jsonElement.getAsString()).toByteString());
            } catch (ParseException unused) {
                throw new InvalidProtocolBufferException("Failed to parse timestamp: " + jsonElement);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDuration(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            try {
                builder.mergeFrom(Durations.parse(jsonElement.getAsString()).toByteString());
            } catch (ParseException unused) {
                throw new InvalidProtocolBufferException("Failed to parse duration: " + jsonElement);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStruct(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            Descriptors.FieldDescriptor findFieldByName = builder.getDescriptorForType().findFieldByName(GraphRequest.FIELDS_PARAM);
            if (findFieldByName == null) {
                throw new InvalidProtocolBufferException("Invalid Struct type.");
            }
            mergeMapField(findFieldByName, jsonElement, builder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeListValue(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            Descriptors.FieldDescriptor findFieldByName = builder.getDescriptorForType().findFieldByName("values");
            if (findFieldByName == null) {
                throw new InvalidProtocolBufferException("Invalid ListValue type.");
            }
            mergeRepeatedField(findFieldByName, jsonElement, builder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeValue(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            Descriptors.Descriptor descriptorForType = builder.getDescriptorForType();
            if (jsonElement instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
                if (jsonPrimitive.isBoolean()) {
                    builder.setField(descriptorForType.findFieldByName("bool_value"), Boolean.valueOf(jsonPrimitive.getAsBoolean()));
                } else if (jsonPrimitive.isNumber()) {
                    builder.setField(descriptorForType.findFieldByName("number_value"), Double.valueOf(jsonPrimitive.getAsDouble()));
                } else {
                    builder.setField(descriptorForType.findFieldByName("string_value"), jsonPrimitive.getAsString());
                }
            } else if (jsonElement instanceof JsonObject) {
                Descriptors.FieldDescriptor findFieldByName = descriptorForType.findFieldByName("struct_value");
                Message.Builder newBuilderForField = builder.newBuilderForField(findFieldByName);
                merge(jsonElement, newBuilderForField);
                builder.setField(findFieldByName, newBuilderForField.build());
            } else if (jsonElement instanceof JsonArray) {
                Descriptors.FieldDescriptor findFieldByName2 = descriptorForType.findFieldByName("list_value");
                Message.Builder newBuilderForField2 = builder.newBuilderForField(findFieldByName2);
                merge(jsonElement, newBuilderForField2);
                builder.setField(findFieldByName2, newBuilderForField2.build());
            } else if (jsonElement instanceof JsonNull) {
                builder.setField(descriptorForType.findFieldByName("null_value"), NullValue.NULL_VALUE.getValueDescriptor());
            } else {
                throw new IllegalStateException("Unexpected json data: " + jsonElement);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWrapper(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            Descriptors.Descriptor descriptorForType = builder.getDescriptorForType();
            Descriptors.FieldDescriptor findFieldByName = descriptorForType.findFieldByName("value");
            if (findFieldByName == null) {
                throw new InvalidProtocolBufferException("Invalid wrapper type: " + descriptorForType.getFullName());
            }
            builder.setField(findFieldByName, parseFieldValue(findFieldByName, jsonElement, builder));
        }

        private void mergeField(Descriptors.FieldDescriptor fieldDescriptor, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            if (fieldDescriptor.isRepeated()) {
                if (builder.getRepeatedFieldCount(fieldDescriptor) > 0) {
                    throw new InvalidProtocolBufferException("Field " + fieldDescriptor.getFullName() + " has already been set.");
                }
            } else if (builder.hasField(fieldDescriptor)) {
                throw new InvalidProtocolBufferException("Field " + fieldDescriptor.getFullName() + " has already been set.");
            }
            if (fieldDescriptor.isRepeated() && (jsonElement instanceof JsonNull)) {
                return;
            }
            if (fieldDescriptor.isMapField()) {
                mergeMapField(fieldDescriptor, jsonElement, builder);
            } else if (fieldDescriptor.isRepeated()) {
                mergeRepeatedField(fieldDescriptor, jsonElement, builder);
            } else if (fieldDescriptor.getContainingOneof() != null) {
                mergeOneofField(fieldDescriptor, jsonElement, builder);
            } else {
                Object parseFieldValue = parseFieldValue(fieldDescriptor, jsonElement, builder);
                if (parseFieldValue != null) {
                    builder.setField(fieldDescriptor, parseFieldValue);
                }
            }
        }

        private void mergeMapField(Descriptors.FieldDescriptor fieldDescriptor, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            if (!(jsonElement instanceof JsonObject)) {
                throw new InvalidProtocolBufferException("Expect a map object but found: " + jsonElement);
            }
            Descriptors.Descriptor messageType = fieldDescriptor.getMessageType();
            Descriptors.FieldDescriptor findFieldByName = messageType.findFieldByName("key");
            Descriptors.FieldDescriptor findFieldByName2 = messageType.findFieldByName("value");
            if (findFieldByName == null || findFieldByName2 == null) {
                throw new InvalidProtocolBufferException("Invalid map field: " + fieldDescriptor.getFullName());
            }
            for (Map.Entry<String, JsonElement> entry : ((JsonObject) jsonElement).entrySet()) {
                Message.Builder newBuilderForField = builder.newBuilderForField(fieldDescriptor);
                Object parseFieldValue = parseFieldValue(findFieldByName, new JsonPrimitive(entry.getKey()), newBuilderForField);
                Object parseFieldValue2 = parseFieldValue(findFieldByName2, entry.getValue(), newBuilderForField);
                if (parseFieldValue2 == null) {
                    if (!this.ignoringUnknownFields || findFieldByName2.getType() != Descriptors.FieldDescriptor.Type.ENUM) {
                        throw new InvalidProtocolBufferException("Map value cannot be null.");
                    }
                } else {
                    newBuilderForField.setField(findFieldByName, parseFieldValue);
                    newBuilderForField.setField(findFieldByName2, parseFieldValue2);
                    builder.addRepeatedField(fieldDescriptor, newBuilderForField.build());
                }
            }
        }

        private void mergeOneofField(Descriptors.FieldDescriptor fieldDescriptor, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            Object parseFieldValue = parseFieldValue(fieldDescriptor, jsonElement, builder);
            if (parseFieldValue == null) {
                return;
            }
            if (builder.getOneofFieldDescriptor(fieldDescriptor.getContainingOneof()) != null) {
                throw new InvalidProtocolBufferException("Cannot set field " + fieldDescriptor.getFullName() + " because another field " + builder.getOneofFieldDescriptor(fieldDescriptor.getContainingOneof()).getFullName() + " belonging to the same oneof has already been set ");
            }
            builder.setField(fieldDescriptor, parseFieldValue);
        }

        private void mergeRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            if (!(jsonElement instanceof JsonArray)) {
                throw new InvalidProtocolBufferException("Expect an array but found: " + jsonElement);
            }
            JsonArray jsonArray = (JsonArray) jsonElement;
            for (int i = 0; i < jsonArray.size(); i++) {
                Object parseFieldValue = parseFieldValue(fieldDescriptor, jsonArray.get(i), builder);
                if (parseFieldValue == null) {
                    if (!this.ignoringUnknownFields || fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.ENUM) {
                        throw new InvalidProtocolBufferException("Repeated field elements cannot be null in field: " + fieldDescriptor.getFullName());
                    }
                } else {
                    builder.addRepeatedField(fieldDescriptor, parseFieldValue);
                }
            }
        }

        private int parseInt32(JsonElement jsonElement) throws InvalidProtocolBufferException {
            try {
                try {
                    return Integer.parseInt(jsonElement.getAsString());
                } catch (Exception unused) {
                    return new BigDecimal(jsonElement.getAsString()).intValueExact();
                }
            } catch (Exception unused2) {
                throw new InvalidProtocolBufferException("Not an int32 value: " + jsonElement);
            }
        }

        private long parseInt64(JsonElement jsonElement) throws InvalidProtocolBufferException {
            try {
                try {
                    return Long.parseLong(jsonElement.getAsString());
                } catch (Exception unused) {
                    return new BigDecimal(jsonElement.getAsString()).longValueExact();
                }
            } catch (Exception unused2) {
                throw new InvalidProtocolBufferException("Not an int64 value: " + jsonElement);
            }
        }

        private int parseUint32(JsonElement jsonElement) throws InvalidProtocolBufferException {
            try {
                try {
                    long parseLong = Long.parseLong(jsonElement.getAsString());
                    if (parseLong < 0 || parseLong > 4294967295L) {
                        throw new InvalidProtocolBufferException("Out of range uint32 value: " + jsonElement);
                    }
                    return (int) parseLong;
                } catch (InvalidProtocolBufferException e) {
                    throw e;
                } catch (Exception unused) {
                    BigInteger bigIntegerExact = new BigDecimal(jsonElement.getAsString()).toBigIntegerExact();
                    if (bigIntegerExact.signum() < 0 || bigIntegerExact.compareTo(new BigInteger("FFFFFFFF", 16)) > 0) {
                        throw new InvalidProtocolBufferException("Out of range uint32 value: " + jsonElement);
                    }
                    return bigIntegerExact.intValue();
                }
            } catch (InvalidProtocolBufferException e2) {
                throw e2;
            } catch (Exception unused2) {
                throw new InvalidProtocolBufferException("Not an uint32 value: " + jsonElement);
            }
        }

        private long parseUint64(JsonElement jsonElement) throws InvalidProtocolBufferException {
            try {
                BigInteger bigIntegerExact = new BigDecimal(jsonElement.getAsString()).toBigIntegerExact();
                if (bigIntegerExact.compareTo(BigInteger.ZERO) < 0 || bigIntegerExact.compareTo(MAX_UINT64) > 0) {
                    throw new InvalidProtocolBufferException("Out of range uint64 value: " + jsonElement);
                }
                return bigIntegerExact.longValue();
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (Exception unused) {
                throw new InvalidProtocolBufferException("Not an uint64 value: " + jsonElement);
            }
        }

        private boolean parseBool(JsonElement jsonElement) throws InvalidProtocolBufferException {
            if (jsonElement.getAsString().equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                return true;
            }
            if (jsonElement.getAsString().equals("false")) {
                return false;
            }
            throw new InvalidProtocolBufferException("Invalid bool value: " + jsonElement);
        }

        private float parseFloat(JsonElement jsonElement) throws InvalidProtocolBufferException {
            if (jsonElement.getAsString().equals("NaN")) {
                return Float.NaN;
            }
            if (jsonElement.getAsString().equals("Infinity")) {
                return Float.POSITIVE_INFINITY;
            }
            if (jsonElement.getAsString().equals("-Infinity")) {
                return Float.NEGATIVE_INFINITY;
            }
            try {
                double parseDouble = Double.parseDouble(jsonElement.getAsString());
                if (parseDouble > 3.402826869208755E38d || parseDouble < -3.402826869208755E38d) {
                    throw new InvalidProtocolBufferException("Out of range float value: " + jsonElement);
                }
                return (float) parseDouble;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (Exception unused) {
                throw new InvalidProtocolBufferException("Not a float value: " + jsonElement);
            }
        }

        private double parseDouble(JsonElement jsonElement) throws InvalidProtocolBufferException {
            if (jsonElement.getAsString().equals("NaN")) {
                return Double.NaN;
            }
            if (jsonElement.getAsString().equals("Infinity")) {
                return Double.POSITIVE_INFINITY;
            }
            if (jsonElement.getAsString().equals("-Infinity")) {
                return Double.NEGATIVE_INFINITY;
            }
            try {
                BigDecimal bigDecimal = new BigDecimal(jsonElement.getAsString());
                if (bigDecimal.compareTo(MAX_DOUBLE) > 0 || bigDecimal.compareTo(MIN_DOUBLE) < 0) {
                    throw new InvalidProtocolBufferException("Out of range double value: " + jsonElement);
                }
                return bigDecimal.doubleValue();
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (Exception unused) {
                throw new InvalidProtocolBufferException("Not an double value: " + jsonElement);
            }
        }

        private String parseString(JsonElement jsonElement) {
            return jsonElement.getAsString();
        }

        private ByteString parseBytes(JsonElement jsonElement) throws InvalidProtocolBufferException {
            try {
                return ByteString.copyFrom(BaseEncoding.base64().decode(jsonElement.getAsString()));
            } catch (IllegalArgumentException unused) {
                return ByteString.copyFrom(BaseEncoding.base64Url().decode(jsonElement.getAsString()));
            }
        }

        private Descriptors.EnumValueDescriptor parseEnum(Descriptors.EnumDescriptor enumDescriptor, JsonElement jsonElement) throws InvalidProtocolBufferException {
            Descriptors.EnumValueDescriptor findValueByNumber;
            String asString = jsonElement.getAsString();
            Descriptors.EnumValueDescriptor findValueByName = enumDescriptor.findValueByName(asString);
            if (findValueByName == null) {
                try {
                    int parseInt32 = parseInt32(jsonElement);
                    if (enumDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO3) {
                        findValueByNumber = enumDescriptor.findValueByNumberCreatingIfUnknown(parseInt32);
                    } else {
                        findValueByNumber = enumDescriptor.findValueByNumber(parseInt32);
                    }
                    findValueByName = findValueByNumber;
                } catch (InvalidProtocolBufferException unused) {
                }
                if (findValueByName == null && !this.ignoringUnknownFields) {
                    throw new InvalidProtocolBufferException("Invalid enum value: " + asString + " for enum type: " + enumDescriptor.getFullName());
                }
            }
            return findValueByName;
        }

        private Object parseFieldValue(Descriptors.FieldDescriptor fieldDescriptor, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            if (jsonElement instanceof JsonNull) {
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE && fieldDescriptor.getMessageType().getFullName().equals(Value.getDescriptor().getFullName())) {
                    return builder.newBuilderForField(fieldDescriptor).mergeFrom(Value.newBuilder().setNullValueValue(0).build().toByteString()).build();
                }
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM && fieldDescriptor.getEnumType().getFullName().equals(NullValue.getDescriptor().getFullName())) {
                    return fieldDescriptor.getEnumType().findValueByNumber(0);
                }
                return null;
            } else if ((jsonElement instanceof JsonObject) && fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.MESSAGE && fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.GROUP) {
                throw new InvalidProtocolBufferException(String.format("Invalid value: %s for expected type: %s", jsonElement, fieldDescriptor.getType()));
            } else {
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        return Integer.valueOf(parseInt32(jsonElement));
                    case 4:
                    case 5:
                    case 6:
                        return Long.valueOf(parseInt64(jsonElement));
                    case 7:
                        return Boolean.valueOf(parseBool(jsonElement));
                    case 8:
                        return Float.valueOf(parseFloat(jsonElement));
                    case 9:
                        return Double.valueOf(parseDouble(jsonElement));
                    case 10:
                    case 11:
                        return Integer.valueOf(parseUint32(jsonElement));
                    case 12:
                    case 13:
                        return Long.valueOf(parseUint64(jsonElement));
                    case 14:
                        return parseString(jsonElement);
                    case 15:
                        return parseBytes(jsonElement);
                    case 16:
                        return parseEnum(fieldDescriptor.getEnumType(), jsonElement);
                    case 17:
                    case 18:
                        int i = this.currentDepth;
                        if (i >= this.recursionLimit) {
                            throw new InvalidProtocolBufferException("Hit recursion limit.");
                        }
                        this.currentDepth = i + 1;
                        Message.Builder newBuilderForField = builder.newBuilderForField(fieldDescriptor);
                        merge(jsonElement, newBuilderForField);
                        this.currentDepth--;
                        return newBuilderForField.build();
                    default:
                        throw new InvalidProtocolBufferException("Invalid field type: " + fieldDescriptor.getType());
                }
            }
        }
    }
}
