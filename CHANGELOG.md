# Changelog

## 1.5.8 - Critical Build Fix
- **Fix:** Permanently resolved the `NoClassDefFoundError` startup crash by correctly bundling the Kyori Adventure library into the plugin JAR.

## 1.5.7
- **Fix:** Reworked the `/hb setbed` tool to prevent the vanilla sleep mechanic and provide clear admin feedback.

## 1.5.6 - Critical Scope Fix & UX Improvements
- **Fix:** Les protections de construction et la mort dans le vide ne s'appliquent qu'aux joueurs de l'arène active.
- **UX:** Compte à rebours « 2, 1 » en sous-titre puis « Go! » en titre.
- **UX:** Titres de score uniformisés (« +1 POINT » et annonce d'équipe).
- **Feat:** Messages de mort dédiés et tablist isolé par arène.

## 1.5.5 - UX Polish & Admin Bed Bypass
- **Fix:** Les opérateurs peuvent désormais casser ou placer les lits malgré la protection.
- **UX:** Compte à rebours de départ « 2, 1, Go! » avec titre dédié.
- **UX:** Titres de score retravaillés : « +1 POINT » pour l’équipe qui marque, annonce colorée pour l’adverse.

## 1.5.4 - Protection Tool Polish
- **Fix:** Prevented duplication of the selection tool when editing regions.
- **Polish:** `/hb protect list` requires being in protection mode.

## 1.5.3 - Protection GUI on /hb list
- **Feat:** Implemented Protection Zone Management GUI on `/hb list`.

## 1.5.2 - Protection List Menu
- **Feat:** Implémentation de `/hb protect list` avec menu de gestion des zones.
- **Fix:** Résolution du conflit entre `/hb list` et `/hb protect list`.

## 1.5.1 - Critical Hotfix
- **Fix:** Players are no longer permanently frozen after a game is manually stopped with `/hb stop`. The game state is now correctly reset.

## 1.5.0 - Lobby Adventure & Zone Manager
- **Feat:** Joueurs en GameMode.ADVENTURE au lobby pour une protection totale.
- **Feat:** Commande `/hb protect list` avec GUI pour gérer les zones protégées.
- **Fix:** Réinitialisation correcte de l'état du joueur après une mort au lobby.
- **Fix:** Tablist stable sans clignotement.

## 1.4.1 - Protection UX fixes
- **Fix:** confirmation for "Position 2" is only sent once.
- **Fix:** block hit animation is cancelled in protected zones.

## 1.4.0 - Protection de zones
- **Feat:** Outil en jeu pour définir des zones protégées avec `/hb protect` et `/hb confirm`.
- **Feat:** Chargement et sauvegarde persistants des régions protégées.
- **Feat:** Empêche les joueurs sans permission de casser ou placer des blocs dans ces zones.

## 1.3.2 - File d'attente sans TP
- **Fix:** l'item « Quitter la file » ne peut plus être posé et fonctionne en l'air.
- **UX:** quitter une file d'attente n'entraîne plus de téléportation au lobby.

## 1.3.1 - Queue & stability tweaks
- **Feat:** Système de file repensé avec barrière de sortie.
- **Fix:** Annulation du compte à rebours et arrêt de partie si un joueur quitte.
- **UX:** Gel initial assoupli permettant de regarder autour de soi.

## 1.3.0 - Gameplay & UX Finalization
- **Feat:** Replaced lobby navigation compass with a clock.
- **Feat:** Implemented instant respawn in arenas, removing the death screen.
- **Fix:** Corrected item drop logic; dropping is now only restricted during active games.
- **Fix:** Removed redundant navigation item from lobby inventory.
- **Chore:** General code cleanup and UX improvements for Heneria.

## 1.2.11
- Fix command registration (/hb)
- Add recovery compass on join
- Improve listener registration & logs

## 1.2.8
- Boussole air/no-TP, GUI verrouillé
- Join anti-spam/atomique
- Admin build

## 1.2.7
- Renommage monde → world_hika
- Boussole partout
- /hb admin

## 1.2.6
- Boussole lobby sans TP
- GUI catégories cliquable

## 1.2.5
- UI Lobby (scoreboard/tablist)
- Boussole au join

## 1.2.4
- Boussole catégories
- /hb create <nom> <teamSize>
- /hb setlobby

## 1.2.3
- Scoreboard adaptatif (zéro espace vide)

## 1.2.2 / 1.2.1 / 1.2.0
- Rework esthétique HUD/Tablist
- Services UI/Feedback/Theme

## 1.1.x
- SetBed, SetBroke, pont cassable
- Base gameplay
