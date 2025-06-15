# CONTRIBUTING

Vielen Dank für dein Interesse an diesem Projekt!  
Mithelfen ist willkommen – ob durch Code, Dokumentation oder Feedback.

## Code-Stil

- Klammersetzen nach Java-Standard (`{` auf gleicher Zeile)
- Verwende 4 Leerzeichen für Einrückungen
- Kommentiere wichtige Abschnitte und öffentliche Methoden

## Branching-Strategie

- `main`: stabile, getestete Releases
- `dev`: aktiver Entwicklungszweig
- Feature-Branches benennen nach dem Muster: `feature/feature-name`
- Bugfixes: `fix/bug-description`

## Pull Requests

1. Forke das Repository
2. Erstelle einen Branch von `dev`
3. Schreibe oder ändere den Code
4. Stelle sicher, dass alle Tests bestehen
5. Reiche einen Pull Request gegen `dev` ein
6. Beschreibe, **was** du geändert hast und **warum**

## Tests & Anforderungen

- Stelle sicher, dass der Code **kompiliert**
- Neue Funktionen müssen durch **Unit-Tests** abgedeckt sein
- Verwende nach Möglichkeit [JUnit 5](https://junit.org/junit5/)
- Lass vor dem Commit `mvn test` durchlaufen

---

Danke für deinen Beitrag! 🙌  
Bei Fragen oder Diskussionen kannst du ein [Issue](https://github.com/sha-ma-ni/prose-app-deploy/issues) erstellen.
