package dev.dkvl.womutils;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import java.awt.image.BufferedImage;
import java.util.Map;
import javax.swing.Icon;
import lombok.AllArgsConstructor;
import net.runelite.client.util.ImageUtil;

@AllArgsConstructor
enum CountryIcon
{
	AFGHANISTAN("af", "1f1e6-1f1eb"),
	ALBANIA("al", "1f1e6-1f1f1"),
	ALGERIA("dz", "1f1e9-1f1ff"),
	AMERICAN_SAMOA("as", "1f1e6-1f1f8"),
	ANDORRA("ad", "1f1e6-1f1e9"),
	ANGOLA("ao", "1f1e6-1f1f4"),
	ANGUILLA("ai", "1f1e6-1f1ee"),
	ANTARCTICA("aq", "1f1e6-1f1f6"),
	ANTIGUA_AND_BARBUDA("ag", "1f1e6-1f1ec"),
	ARGENTINA("ar", "1f1e6-1f1f7"),
	ARMENIA("am", "1f1e6-1f1f2"),
	ARUBA("aw", "1f1e6-1f1fc"),
	ASCENSION_ISLAND("ac", "1f1e6-1f1e8"),
	AUSTRALIA("au", "1f1e6-1f1fa"),
	AUSTRIA("at", "1f1e6-1f1f9"),
	AZERBAIJAN("az", "1f1e6-1f1ff"),
	BAHAMAS("bs", "1f1e7-1f1f8"),
	BAHRAIN("bh", "1f1e7-1f1ed"),
	BANGLADESH("bd", "1f1e7-1f1e9"),
	BARBADOS("bb", "1f1e7-1f1e7"),
	BELARUS("by", "1f1e7-1f1fe"),
	BELGIUM("be", "1f1e7-1f1ea"),
	BELIZE("bz", "1f1e7-1f1ff"),
	BENIN("bj", "1f1e7-1f1ef"),
	BERMUDA("bm", "1f1e7-1f1f2"),
	BHUTAN("bt", "1f1e7-1f1f9"),
	BOLIVIA("bo", "1f1e7-1f1f4"),
	BOSNIA_AND_HERZEGOVINA("ba", "1f1e7-1f1e6"),
	BOTSWANA("bw", "1f1e7-1f1fc"),
	BOUVET_ISLAND("bv", "1f1e7-1f1fb"),
	BRAZIL("br", "1f1e7-1f1f7"),
	BRITISH_INDIAN_OCEAN_TERRITORY("io", "1f1ee-1f1f4"),
	BRITISH_VIRGIN_ISLANDS("vg", "1f1fb-1f1ec"),
	BRUNEI("bn", "1f1e7-1f1f3"),
	BULGARIA("bg", "1f1e7-1f1ec"),
	BURKINA_FASO("bf", "1f1e7-1f1eb"),
	BURUNDI("bi", "1f1e7-1f1ee"),
	CAMBODIA("kh", "1f1f0-1f1ed"),
	CAMEROON("cm", "1f1e8-1f1f2"),
	CANADA("ca", "1f1e8-1f1e6"),
	CANARY_ISLANDS("ic", "1f1ee-1f1e8"),
	CAPE_VERDE("cv", "1f1e8-1f1fb"),
	CARIBBEAN_NETHERLANDS("bq", "1f1e7-1f1f6"),
	CAYMAN_ISLANDS("ky", "1f1f0-1f1fe"),
	CENTRAL_AFRICAN_REPUBLIC("cf", "1f1e8-1f1eb"),
	CEUTA_AND_MELILLA("ea", "1f1ea-1f1e6"),
	CHAD("td", "1f1f9-1f1e9"),
	CHILE("cl", "1f1e8-1f1f1"),
	CHINA("cn", "1f1e8-1f1f3"),
	CHRISTMAS_ISLAND("cx", "1f1e8-1f1fd"),
	CLIPPERTON_ISLAND("cp", "1f1e8-1f1f5"),
	COCOS_KEELING_ISLANDS("cc", "1f1e8-1f1e8"),
	COLOMBIA("co", "1f1e8-1f1f4"),
	COMOROS("km", "1f1f0-1f1f2"),
	CONGO__BRAZZAVILLE("cg", "1f1e8-1f1ec"),
	CONGO__KINSHASA("cd", "1f1e8-1f1e9"),
	COOK_ISLANDS("ck", "1f1e8-1f1f0"),
	COSTA_RICA("cr", "1f1e8-1f1f7"),
	CROATIA("hr", "1f1ed-1f1f7"),
	CUBA("cu", "1f1e8-1f1fa"),
	CURAÇAO("cw", "1f1e8-1f1fc"),
	CYPRUS("cy", "1f1e8-1f1fe"),
	CZECH_REPUBLIC("cz", "1f1e8-1f1ff"),
	CÔTE_DIVOIRE("ci", "1f1e8-1f1ee"),
	DENMARK("dk", "1f1e9-1f1f0"),
	DIEGO_GARCIA("dg", "1f1e9-1f1ec"),
	DJIBOUTI("dj", "1f1e9-1f1ef"),
	DOMINICA("dm", "1f1e9-1f1f2"),
	DOMINICAN_REPUBLIC("do", "1f1e9-1f1f4"),
	ECUADOR("ec", "1f1ea-1f1e8"),
	EGYPT("eg", "1f1ea-1f1ec"),
	EL_SALVADOR("sv", "1f1f8-1f1fb"),
	EQUATORIAL_GUINEA("gq", "1f1ec-1f1f6"),
	ERITREA("er", "1f1ea-1f1f7"),
	ESTONIA("ee", "1f1ea-1f1ea"),
	ETHIOPIA("et", "1f1ea-1f1f9"),
	EUROPEAN_UNION("eu", "1f1ea-1f1fa"),
	FALKLAND_ISLANDS("fk", "1f1eb-1f1f0"),
	FAROE_ISLANDS("fo", "1f1eb-1f1f4"),
	FIJI("fj", "1f1eb-1f1ef"),
	FINLAND("fi", "1f1eb-1f1ee"),
	FRANCE("fr", "1f1eb-1f1f7"),
	FRENCH_GUIANA("gf", "1f1ec-1f1eb"),
	FRENCH_POLYNESIA("pf", "1f1f5-1f1eb"),
	FRENCH_SOUTHERN_TERRITORIES("tf", "1f1f9-1f1eb"),
	GABON("ga", "1f1ec-1f1e6"),
	GAMBIA("gm", "1f1ec-1f1f2"),
	GEORGIA("ge", "1f1ec-1f1ea"),
	GERMANY("de", "1f1e9-1f1ea"),
	GHANA("gh", "1f1ec-1f1ed"),
	GIBRALTAR("gi", "1f1ec-1f1ee"),
	GREECE("gr", "1f1ec-1f1f7"),
	GREENLAND("gl", "1f1ec-1f1f1"),
	GRENADA("gd", "1f1ec-1f1e9"),
	GUADELOUPE("gp", "1f1ec-1f1f5"),
	GUAM("gu", "1f1ec-1f1fa"),
	GUATEMALA("gt", "1f1ec-1f1f9"),
	GUERNSEY("gg", "1f1ec-1f1ec"),
	GUINEA("gn", "1f1ec-1f1f3"),
	GUINEABISSAU("gw", "1f1ec-1f1fc"),
	GUYANA("gy", "1f1ec-1f1fe"),
	HAITI("ht", "1f1ed-1f1f9"),
	HEARD_AND_MCDONALD_ISLANDS("hm", "1f1ed-1f1f2"),
	HONDURAS("hn", "1f1ed-1f1f3"),
	HONG_KONG_SAR_CHINA("hk", "1f1ed-1f1f0"),
	HUNGARY("hu", "1f1ed-1f1fa"),
	ICELAND("is", "1f1ee-1f1f8"),
	INDIA("in", "1f1ee-1f1f3"),
	INDONESIA("id", "1f1ee-1f1e9"),
	IRAN("ir", "1f1ee-1f1f7"),
	IRAQ("iq", "1f1ee-1f1f6"),
	IRELAND("ie", "1f1ee-1f1ea"),
	ISLE_OF_MAN("im", "1f1ee-1f1f2"),
	ISRAEL("il", "1f1ee-1f1f1"),
	ITALY("it", "1f1ee-1f1f9"),
	JAMAICA("jm", "1f1ef-1f1f2"),
	JAPAN_FLAG("jp", "1f1ef-1f1f5"),
	JERSEY("je", "1f1ef-1f1ea"),
	JORDAN("jo", "1f1ef-1f1f4"),
	KAZAKHSTAN("kz", "1f1f0-1f1ff"),
	KENYA("ke", "1f1f0-1f1ea"),
	KIRIBATI("ki", "1f1f0-1f1ee"),
	KOSOVO("xk", "1f1fd-1f1f0"),
	KUWAIT("kw", "1f1f0-1f1fc"),
	KYRGYZSTAN("kg", "1f1f0-1f1ec"),
	LAOS("la", "1f1f1-1f1e6"),
	LATVIA("lv", "1f1f1-1f1fb"),
	LEBANON("lb", "1f1f1-1f1e7"),
	LESOTHO("ls", "1f1f1-1f1f8"),
	LIBERIA("lr", "1f1f1-1f1f7"),
	LIBYA("ly", "1f1f1-1f1fe"),
	LIECHTENSTEIN("li", "1f1f1-1f1ee"),
	LITHUANIA("lt", "1f1f1-1f1f9"),
	LUXEMBOURG("lu", "1f1f1-1f1fa"),
	MACAU_SAR_CHINA("mo", "1f1f2-1f1f4"),
	MACEDONIA("mk", "1f1f2-1f1f0"),
	MADAGASCAR("mg", "1f1f2-1f1ec"),
	MALAWI("mw", "1f1f2-1f1fc"),
	MALAYSIA("my", "1f1f2-1f1fe"),
	MALDIVES("mv", "1f1f2-1f1fb"),
	MALI("ml", "1f1f2-1f1f1"),
	MALTA("mt", "1f1f2-1f1f9"),
	MARSHALL_ISLANDS("mh", "1f1f2-1f1ed"),
	MARTINIQUE("mq", "1f1f2-1f1f6"),
	MAURITANIA("mr", "1f1f2-1f1f7"),
	MAURITIUS("mu", "1f1f2-1f1fa"),
	MAYOTTE("yt", "1f1fe-1f1f9"),
	MEXICO("mx", "1f1f2-1f1fd"),
	MICRONESIA("fm", "1f1eb-1f1f2"),
	MOLDOVA("md", "1f1f2-1f1e9"),
	MONACO("mc", "1f1f2-1f1e8"),
	MONGOLIA("mn", "1f1f2-1f1f3"),
	MONTENEGRO("me", "1f1f2-1f1ea"),
	MONTSERRAT("ms", "1f1f2-1f1f8"),
	MOROCCO("ma", "1f1f2-1f1e6"),
	MOZAMBIQUE("mz", "1f1f2-1f1ff"),
	MYANMAR_BURMA("mm", "1f1f2-1f1f2"),
	NAMIBIA("na", "1f1f3-1f1e6"),
	NAURU("nr", "1f1f3-1f1f7"),
	NEPAL("np", "1f1f3-1f1f5"),
	NETHERLANDS("nl", "1f1f3-1f1f1"),
	NEW_CALEDONIA("nc", "1f1f3-1f1e8"),
	NEW_ZEALAND("nz", "1f1f3-1f1ff"),
	NICARAGUA("ni", "1f1f3-1f1ee"),
	NIGER("ne", "1f1f3-1f1ea"),
	NIGERIA("ng", "1f1f3-1f1ec"),
	NIUE("nu", "1f1f3-1f1fa"),
	NORFOLK_ISLAND("nf", "1f1f3-1f1eb"),
	NORTH_KOREA("kp", "1f1f0-1f1f5"),
	NORTHERN_MARIANA_ISLANDS("mp", "1f1f2-1f1f5"),
	NORWAY("no", "1f1f3-1f1f4"),
	OMAN("om", "1f1f4-1f1f2"),
	PAKISTAN("pk", "1f1f5-1f1f0"),
	PALAU("pw", "1f1f5-1f1fc"),
	PALESTINIAN_TERRITORIES("ps", "1f1f5-1f1f8"),
	PANAMA("pa", "1f1f5-1f1e6"),
	PAPUA_NEW_GUINEA("pg", "1f1f5-1f1ec"),
	PARAGUAY("py", "1f1f5-1f1fe"),
	PERU("pe", "1f1f5-1f1ea"),
	PHILIPPINES("ph", "1f1f5-1f1ed"),
	PITCAIRN_ISLANDS("pn", "1f1f5-1f1f3"),
	POLAND("pl", "1f1f5-1f1f1"),
	PORTUGAL("pt", "1f1f5-1f1f9"),
	PUERTO_RICO("pr", "1f1f5-1f1f7"),
	QATAR("qa", "1f1f6-1f1e6"),
	ROMANIA("ro", "1f1f7-1f1f4"),
	RUSSIA("ru", "1f1f7-1f1fa"),
	RWANDA("rw", "1f1f7-1f1fc"),
	RÉUNION("re", "1f1f7-1f1ea"),
	SAMOA("ws", "1f1fc-1f1f8"),
	SAN_MARINO("sm", "1f1f8-1f1f2"),
	SAUDI_ARABIA("sa", "1f1f8-1f1e6"),
	SENEGAL("sn", "1f1f8-1f1f3"),
	SERBIA("rs", "1f1f7-1f1f8"),
	SEYCHELLES("sc", "1f1f8-1f1e8"),
	SIERRA_LEONE("sl", "1f1f8-1f1f1"),
	SINGAPORE("sg", "1f1f8-1f1ec"),
	SINT_MAARTEN("sx", "1f1f8-1f1fd"),
	SLOVAKIA("sk", "1f1f8-1f1f0"),
	SLOVENIA("si", "1f1f8-1f1ee"),
	SOLOMON_ISLANDS("sb", "1f1f8-1f1e7"),
	SOMALIA("so", "1f1f8-1f1f4"),
	SOUTH_AFRICA("za", "1f1ff-1f1e6"),
	SOUTH_GEORGIA_AND_SOUTH_SANDWICH_ISLANDS("gs", "1f1ec-1f1f8"),
	SOUTH_KOREA("kr", "1f1f0-1f1f7"),
	SOUTH_SUDAN("ss", "1f1f8-1f1f8"),
	SPAIN("es", "1f1ea-1f1f8"),
	SRI_LANKA("lk", "1f1f1-1f1f0"),
	ST_BARTHÉLEMY("bl", "1f1e7-1f1f1"),
	ST_HELENA("sh", "1f1f8-1f1ed"),
	ST_KITTS_AND_NEVIS("kn", "1f1f0-1f1f3"),
	ST_LUCIA("lc", "1f1f1-1f1e8"),
	ST_MARTIN("mf", "1f1f2-1f1eb"),
	ST_PIERRE_AND_MIQUELON("pm", "1f1f5-1f1f2"),
	ST_VINCENT_AND_GRENADINES("vc", "1f1fb-1f1e8"),
	SUDAN("sd", "1f1f8-1f1e9"),
	SURINAME("sr", "1f1f8-1f1f7"),
	SVALBARD_AND_JAN_MAYEN("sj", "1f1f8-1f1ef"),
	SWAZILAND("sz", "1f1f8-1f1ff"),
	SWEDEN("se", "1f1f8-1f1ea"),
	SWITZERLAND("ch", "1f1e8-1f1ed"),
	SYRIA("sy", "1f1f8-1f1fe"),
	SÃO_TOMÉ_AND_PRÍ­NCIPE("st", "1f1f8-1f1f9"),
	TAIWAN("tw", "1f1f9-1f1fc"),
	TAJIKISTAN("tj", "1f1f9-1f1ef"),
	TANZANIA("tz", "1f1f9-1f1ff"),
	THAILAND("th", "1f1f9-1f1ed"),
	TIMORLESTE("tl", "1f1f9-1f1f1"),
	TOGO("tg", "1f1f9-1f1ec"),
	TOKELAU("tk", "1f1f9-1f1f0"),
	TONGA("to", "1f1f9-1f1f4"),
	TRINIDAD_AND_TOBAGO("tt", "1f1f9-1f1f9"),
	TRISTAN_DA_CUNHA("ta", "1f1f9-1f1e6"),
	TUNISIA("tn", "1f1f9-1f1f3"),
	TURKEY_FLAG("tr", "1f1f9-1f1f7"),
	TURKMENISTAN("tm", "1f1f9-1f1f2"),
	TURKS_AND_CAICOS_ISLANDS("tc", "1f1f9-1f1e8"),
	TUVALU("tv", "1f1f9-1f1fb"),
	US_OUTLYING_ISLANDS("um", "1f1fa-1f1f2"),
	US_VIRGIN_ISLANDS("vi", "1f1fb-1f1ee"),
	UGANDA("ug", "1f1fa-1f1ec"),
	UKRAINE("ua", "1f1fa-1f1e6"),
	UNITED_ARAB_EMIRATES("ae", "1f1e6-1f1ea"),
	UNITED_KINGDOM("gb", "1f1ec-1f1e7"),
	UNITED_STATES("us", "1f1fa-1f1f8"),
	URUGUAY("uy", "1f1fa-1f1fe"),
	UZBEKISTAN("uz", "1f1fa-1f1ff"),
	VANUATU("vu", "1f1fb-1f1fa"),
	VATICAN_CITY("va", "1f1fb-1f1e6"),
	VENEZUELA("ve", "1f1fb-1f1ea"),
	VIETNAM("vn", "1f1fb-1f1f3"),
	WALLIS_AND_FUTUNA("wf", "1f1fc-1f1eb"),
	WESTERN_SAHARA("eh", "1f1ea-1f1ed"),
	YEMEN("ye", "1f1fe-1f1ea"),
	ZAMBIA("zm", "1f1ff-1f1f2"),
	ZIMBABWE("zw", "1f1ff-1f1fc"),
	DEFAULT("default", "default")
	;
	private final String languageCode;
	private final String codepoint;

	static final int ICON_WIDTH = 12;
	private static final Map<String, CountryIcon> ICONS;

	static
	{
		ImmutableMap.Builder<String, CountryIcon> iconBuilder = new ImmutableMap.Builder<>();

		for (final CountryIcon icon : values())
		{
			iconBuilder.put(icon.languageCode, icon);
		}

		ICONS = iconBuilder.build();
	}

	BufferedImage loadImage()
	{
		return ImageUtil.getResourceStreamFromClass(getClass(), codepoint + ".png");
	}

	static CountryIcon getIcon(String countryCode)
	{
		return ICONS.getOrDefault(countryCode, DEFAULT);
	}
}
