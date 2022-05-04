# NavigationDrawer
Exemplo de Navigation Drawer Activity

Alguns arquivos úteis:

- alteração "cabeçalho":
 layout/nav_header_main.xml;

- alteração dos itens do menu:
menu/activity_main_drawer.xml;

- vínculo dos fragments:
navigation/mobile_navigation.xml

Passos para adicionar novo item:
1) menu/activity_main_drawer.xml para adicionar na lista de opções do menu;
biblioteca de ícones:
- https://fonts.google.com/icons?selected=Material+Icons
- https://materialdesignicons.com/

2) MainActivity.java - adicionar o id do item criado na lista para detectar clique;

3) navigation/mobile_navigation: adicionar novo fragment (adicionar via aba de design ou code), adicionar id, name, layout. 
*** IMPORTANTE ***
- id = item criado no grupo no passo 1!!
- name = nome do arquivo Java referente ao Fragment que será criado;
- layout: nome do arquivo XML referente ao Fragment que será criado;
- label: título para o fragment (opcional);

4) criar um Fragment que será aberto ao clicar no item:
- botão direito, new, Fragment (blank);
- alterar nome do arquivo;
- alterar xml do Fragment criado (ConstraintLayout e TextView);
- corrigir passo 3 com os nomes dos arquivos de Fragment criados;


