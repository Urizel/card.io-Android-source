package io.card.payment.i18n.locales;

import java.util.HashMap;
import java.util.Map;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;

// Class autogenerated!  Do not modify.
// Generated on 2014-12-10 11:29:25.169528 via script:
// /Users/twhipple/Documents/buffalo/lib-i18n/i18n/script/generate_android_i18n.py -java_src_path src/ -java_gen_path gen/ -stringkey_path io/card/payment/i18n/ -strings_path ../strings/projects/card.io/strings/ --strict

public class LocalizedStringsRU implements SupportedLocale<StringKey> {

    private static Map<StringKey, String> mDisplay = new HashMap<>();
    private static Map<String, String> mAdapted = new HashMap<>();

    @Override
    public String getName() {
        return "ru";
    }

    @Override
    public String getAdaptedDisplay(StringKey key, String country) {
        String adaptedKey = key.toString() + "|" + country;
        if (mAdapted.containsKey(adaptedKey)) {
            return mAdapted.get(adaptedKey);
        } else {
            return mDisplay.get(key);
        }
    }

    public LocalizedStringsRU() {
        mDisplay.put(StringKey.CANCEL, "Отмена");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.CARDTYPE_MIR, "Мир");
        mDisplay.put(StringKey.DONE, "Готово");
        mDisplay.put(StringKey.ENTRY_CVV, "Код безопасности");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "Индекс");
        mDisplay.put(StringKey.ENTRY_CARDHOLDER_NAME, "Имя и фамилия владельца");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "Действ. до");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "ММ/ГГ");
        mDisplay.put(StringKey.SCAN_GUIDE, "Держите карту внутри рамки.\nОна будет считана автоматически.");
        mDisplay.put(StringKey.KEYBOARD, "Клавиатура…");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "Номер карты");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Ввести данные вручную");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "В данном устройстве нет опции считывания номера карты с помощью фотокамеры.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Фотокамера устройства недоступна.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Возникла незапланированная ошибка при открытии фотокамеры устройства.");

        // no adapted_translations found
    }
}
