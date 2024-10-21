package com.meet7834.lox;

enum TokenType {
    // single character tokens:
    LEFT_PAREN, RIGHT_PAREN,
    LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, SEMICOLON,
    MINUS, PLUS, SLASH, STAR,

    // one or two character tokens:
    BANG, BANG_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    // literals:
    IDENTIFIER, STRING, NUMBER,

    // keywords:
    END, OR, TRUE, FALSE, CLASS, FUN, FOR, WHILE,
    IF, ELSE, NIL, PRINT, RETURN, SUPER, THIS, VAR,

    EOF
}