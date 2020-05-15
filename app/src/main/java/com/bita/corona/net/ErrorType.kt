package com.bita.corona.net

@Suppress("NonAsciiCharacters", "EnumEntryName", "SpellCheckingInspection")
enum class ErrorType(val code: String) {
    정상("0000"),
    어플리케이션_에러("0001"),
    데이터베이스_에러("0002"),
    데이터없음_에러("0003"),
    HTTP_에러("0004"),
    서비스_연결실패_에러("0005"),
    잘못된_요청_파라메터_에러("0010"),
    필수요청_파라메터가_없음("0011"),
    해당_오픈API서비스가_없거나_폐기됨("0012"),
    서비스_접근거부("0020"),
    일시적으로_사용할_수_없는_서비스_키("0021"),
    서비스_요청제한횟수_초과에러("0022"),
    등록되지_않은_서비스키("0030"),
    기한만료된_서비스키("0031"),
    등록되지_않은_IP("0032"),
    서명되지_않은_호출("0033"),
    기타에러("0099");
}