# Ascii Generator

## A - General

### A - 1 - Compilation

Dans un terminal windows :

`compile.bat`

Sinon :

`javac -cp lib/* @option.list @compile.list`

---

## B - App Image

### B - 1 - Execution

Dans un terminal windows :

`run-image.bat`

Sinon :

`java -Dfile.encoding=UTF-8 -cp bin;lib/* asciigenerator.image.App`

### B - 2 - Demonstration

Exemples avec différentes variantes de configurations de [App.java](src/asciigenerator/image/App.java) :
> Les fichiers générés sont disponibles [ici](.github/resultats/).

> Les images générées sont disponibles [ici](.github/images/).

#### B - 2 - a) Textes

![texte 1](.github/images/texte-1.png)

![texte 2](.github/images/texte-2.png)

![texte 3](.github/images/texte-3.png)

#### B - 2 - b) Photos

![paris 1](.github/images/paris-1.png)

![paris 2](.github/images/paris-2.png)

#### B - 2 - c) Simples

![swag](.github/images/swag.png)

![emoji 1](.github/images/emoji-1.png)

![emoji 2](.github/images/emoji-2.png)

![bloc 1](.github/images/bloc-1.png)

![bloc 2](.github/images/bloc-2.png)

---

## C - App Tree

### C - 1 - Execution

Dans un terminal windows :

`run-tree.bat`

Sinon :

`java -Dfile.encoding=UTF-8 -cp bin;lib/* asciigenerator.arborescence.App`

### C - 2 - Demonstration

Exemples avec différentes variantes de configurations de [App.java](src/asciigenerator/arborescence/App.java) :

```txt
📁 root
├── 📁 assets
│   ├── 📁 images
│   │   └── 📄 logo.png
│   └── 📁 styles
│       └── 📄 style.css
└── 📁 src
    ├── 📁 core
    │   └── 📄 Main.java
    └── 📁 utils
        ├── 📄 helpers.java
        └── 📄 parser.java
```

```txt
root
╠═ assets
║  ╠═ images
║  ║  ╚═ logo.png
║  ╚═ styles
║     ╚═ style.css
╚═ src
   ╠═ core
   ║  ╚═ Main.java
   ╚═ utils
      ╠═ helpers.java
      ╚═ parser.java
```

```txt
root
|-- assets
|   |-- images
|   |   `-- logo.png
|   `-- styles
|       `-- style.css
`-- src
    |-- core
    |   `-- Main.java
    `-- utils
        |-- helpers.java
        `-- parser.java
```

## D - App Texte

...
