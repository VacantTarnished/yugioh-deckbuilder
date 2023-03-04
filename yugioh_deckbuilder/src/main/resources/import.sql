-- noinspection SqlNoDataSourceInspectionForFile

-- BannedCard
insert into BannedCard (id, name, allowedamount)
values (nextval('BannedCard_seq'), 'Foolish Burial', 1);

insert into BannedCard (id, name, allowedamount)
values (nextval('BannedCard_seq'), 'Called by the Grave', 1);

-- PrintSets
insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'MAMA', 'Magnificent Mavens');

insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'DASA', 'Dark Saviors');

insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'SR07', 'Structure Deck: Zombie Horde');

insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'GFTP', 'Ghosts From the Past');

insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'MP22', '2022 Tin of the Pharaoh''s Gods');

insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'DUSA', 'Duelist Saga');

insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'GFP2', 'Ghosts From the Past: The 2nd Haunting');

insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'SESL', 'Secret Slayers');

insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'LCKC', 'Legendary Collection Kaiba Mega Pack');

insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'MP19', '2019 Gold Sarcophagus Tin Mega Pack');

insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'SDSH', 'Shaddoll Showdown');

insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'DUOV', 'Duel Overload');

insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'SD2', 'Zombie Madness');

insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'EXFO', 'Extreme Force');

insert into PrintSet (id, shortName, longName)
values (nextval('print_set_seq'), 'BACH', 'Battle of Chaos');

-- CardType
insert into CardType (id, type)
values (nextval('CardType_seq'), 'Zombie');

insert into CardType (id, type)
values (nextval('CardType_seq'), 'Effect');

insert into CardType (id, type)
values (nextval('CardType_seq'), 'Tuner');

-- CardAttribute
insert into CardAttribute (id, attribute)
values (nextval('CardAttribute_seq'), 'Earth');

insert into CardAttribute (id, attribute)
values (nextval('CardAttribute_seq'), 'Trap');

insert into CardAttribute (id, attribute)
values (nextval('CardAttribute_seq'), 'Spell');

insert into CardAttribute (id, attribute)
values (nextval('CardAttribute_seq'), 'Dark');

insert into CardAttribute (id, attribute)
values (nextval('CardAttribute_seq'), 'Fire');

-- Cards
insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '050', 'Ultra Rare', 'EN', true, 'normal summon', 'You can banish this card from your GY, then target 1 Zombie monster in your GY; Special Summon that target.', 1700, 800, 4, 'Mezuki', 'https://static.cardmarket.com/img/9d5cdc2d3088cd95d787598e1a735f86/items/5/MAMA/681075.jpg', null, 1, 1);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '257', 'Secret Rare', 'EN', true, 'normal summon', 'When a card or effect is activated that includes any of these effects (Quick Effect): You can discard this card; negate that effect.\n●Add a card from the Deck to the hand.\n●Special Summon from the Deck.\n●Send a card from the Deck to the GY.\nYou can only use this effect of "Ash Blossom & Joyous Spring" once per turn.', 0, 1800, 3, 'Ash Blossom & Joyous Spring', 'https://static.cardmarket.com/img/daeac6c3348c396ba6d8f098dae33fd9/items/5/MP22/673759.jpg', null, 201, 201);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '172', 'Ultra Rare', 'EN', true, 'set', 'When a Spell/Trap Card, or monster effect, is activated while you control a "Vampire" monster: Negate the activation, and if you do, destroy that card, then, if it was a Monster Card, gain LP equal to its original ATK. You can only activate 1 "Vampire Domination" per turn.', null, null, null, 'Vampire Domination', 'https://static.cardmarket.com/img/c32c4366e50ce3df3e4521f6162afa9e/items/5/GFP2/652754.jpg', 'Counter', 301, 51);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '002', 'Super Rare', 'EN', true, 'normal summon', 'If this card is Special Summoned: You can pay 500 LP; add 1 "Vampire" Spell/Trap from your Deck to your hand. If this card is in your GY: You can send 1 "Vampire" card from your hand or face-up field to the GY; Special Summon this card, but banish it when it leaves the field. You can only use each effect of "Vampire Retainer" once per turn.', 1200, 0, 2, 'Vampire Retainer', 'https://static.cardmarket.com/img/7c678923a76439ab3781638665ec7cba/items/5/DASA/357215.jpg', null, 51, 151);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '070', 'Ultra Rare', 'EN', true, 'normal summon', 'If this card in your possession is sent to your Graveyard by your opponent''s card (either by battle or by card effect): You can add 1 DARK "Vampire" monster or 1 "Vampire" Spell/Trap Card from your Deck to your hand. You can banish this card from your Graveyard; 1 DARK "Vampire" monster you Normal Summon this turn can be Summoned without Tributing.', 1500, 1500, 4, 'Vampire Sorcerer', 'https://static.cardmarket.com/img/08823eda464b55c73a84c1cc1cd74800/items/5/GFP2/652653.jpg', null, 301, 151);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '258', 'Secret Rare', 'EN', true, 'normal summon', 'When a card or effect is activated that includes any of these effects (Quick Effect): You can discard this card; negate that activation.\n●Add a card(s) from the GY to the hand, Deck, and/or Extra Deck.\n●Special Summon a Monster Card(s) from the GY.\n●Banish a card(s) from the GY.\nYou can only use this effect of "Ghost Belle & Haunted Mansion" once per turn.', 0, 1800, 3, 'Ghost Belle & Haunted Mansion', 'https://static.cardmarket.com/img/41ccbf84f73a34fc076cece99f287748/items/5/MP22/673760.jpg', null, 201, 1);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '001', 'Ultra Rare', 'EN', false, 'special summon', 'Cannot be Normal Summoned/Set. Must be Special Summoned (from your hand) by banishing 1 "Vampire Lord" you control, and cannot be Special Summoned by other ways. Once per turn: You can discard 1 Zombie-Type monster to the Graveyard, then target 1 Zombie-Type monster in your Graveyard with a Level less than the discarded Zombie-Type monster''s; Special Summon that target.', 3000, 2100, 8, 'Vampire Genesis', 'https://static.cardmarket.com/img/530e266ffc5df3593c4f62deadc89c22/items/5/LCJW/264595.jpg', null, 601, 151);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '237', 'Common', 'EN', false, '1 tribute summon', 'If this card is Normal or Special Summoned: You can pay 1000 LP, then target 1 "Vampire" monster in your GY, except "Vampire Scarlet Scourge"; Special Summon it, but it cannot attack this turn. You can only use this effect of "Vampire Scarlet Scourge" once per turn. At the end of the Battle Phase, if this card destroyed any monster(s) by battle: You can Special Summon them from the GYs to your field.', 2200, 2200, 6, 'Vampire Scarlet Scourge', 'https://static.cardmarket.com/img/1b517dbe1aa1e0fd7d0de1411e5db34a/items/5/MP19/396157.jpg', null, 451, 151);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '001', 'Ultra Rare', 'EN', true, '2 tribute summon', 'If this card is Normal Summoned: You can target up to 2 monsters in your opponent''s GY; Special Summon those monsters to your field in Defense Position, but their effects are negated. When a monster''s effect is activated, while a monster(s) with its same name is in the GY(s) (Quick Effect): You can negate the activation. If a monster(s) is Special Summoned from your opponent''s GY: You can Tribute 2 monsters; Special Summon this card from your GY. You can only use each effect of "Vampire Voivode" once per turn.', 2800, 2100, 8, 'Vampire Voivode', 'https://static.cardmarket.com/img/a41629a50b7401e2f90c5021499a1522/items/5/GFTP/557723.jpg', null, 151, 151);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '020', 'Ultra Rare', 'EN', true, 'normal summon', 'During your Main Phase: You can send 1 Zombie monster from your Deck to the GY. If this card is sent to the GY: You can banish 1 Zombie monster from your GY, except "Gozuki"; Special Summon 1 Zombie monster from your hand. You can only use each effect of "Gozuki" once per turn.', 1700, 800, 4, 'Gozuki', 'https://static.cardmarket.com/img/f9018e89f212ce5e606178b142b69282/items/5/DUSA/296493.jpg', null, 251, 1);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '001', 'Super Rare', 'EN', true, 'normal summon', 'If this card is Special Summoned: You can pay 500 LP; add 1 "Vampire" monster from your Deck to your hand, except "Vampire Familiar". If this card is in your GY: You can send 1 "Vampire" card from your hand or face-up field to the GY; Special Summon this card, but banish it when it leaves the field. You can only use each effect of "Vampire Familiar" once per turn.', 500, 0, 1, 'Vampire Familiar', 'https://static.cardmarket.com/img/8b8122b775785a17675dc981054b5a70/items/5/DASA/357214.jpg', null, 51, 151);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '001', 'Ultra Rare', 'EN', true, '2 tribute summon', 'During the Standby Phase, if a face-up card is in a Field Zone and this card is in your GY: You can Special Summon this card in Defense Position. You can only use this effect of "Doomking Balerdroch" once per turn. Once per Chain, when a Zombie monster, except "Doomking Balerdroch", activates its effect (except during the Damage Step) (Quick Effect): You can apply 1 of these effects (but you cannot apply that same effect of "Doomking Balerdroch" again this turn).\n●Negate that effect.\n●Banish 1 monster from the field or GY.', 2800, 2000, 8, 'Doomking Balerdroch', 'https://static.cardmarket.com/img/805e499cf2706f99055db92bbf579df5/items/5/SR07/365618.jpg', null, 101, 151);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '114', 'Ultra Rare', 'EN', true, 'normal summon', '"Zombie World" in the Field Zone cannot be destroyed by card effects, also neither player can target it with card effects. (Quick Effect): You can banish this card from your field or GY; activate 1 "Zombie World" directly from your hand or Deck. You can only use this effect of "Necroworld Banshee" once per turn.', 1800, 200, 4, 'Necroworld Banshee', 'https://static.cardmarket.com/img/e71fd227ccd95e5bccabfc35364abb1e/items/5/GFP2/652697.jpg', null, 301, 151);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '015', 'Ultra Rare', 'EN', true, 'normal summon', 'If this card is Normal Summoned: You can send 1 other "Vampire" card from your hand or face-up field to the GY; add 1 Level 4 or higher "Vampire" monster from your Deck to your hand, and if you do, send 1 Level 2 or lower "Vampire" monster from your Deck to the GY. During the Main Phase (Quick Effect): You can banish this card from your GY and pay 500 LP; immediately after this effect resolves, Normal Summon 1 "Vampire" monster. You can only use each effect of "Vampire Ghost" once per turn.', 1500, 0, 3, 'Vampire Ghost', 'https://static.cardmarket.com/img/97b0f120d58ddc529b221cdd4304cc9d/items/5/BACH/607221.jpg', null, 701, 151);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '042', 'Super Rare', 'EN', true, 'normal summon', 'You can target 1 face-up monster on the field; discard 1 card, and if you do, increase that target''s Level by 1. You can target 1 face-up monster on the field; monsters you control cannot attack for the rest of this turn, except Zombie monsters, also send 1 Zombie monster from your Deck to the GY, and if you do, increase that target''s Level by 1. You can only use each effect of "Uni-Zombie" once per turn.', 1300, 0, 3, 'Uni-Zombie', 'https://static.cardmarket.com/img/a9914cb1d64e08a26abc10697aa96058/items/5/SESL/448533.jpg', null, 351, 151);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '050', 'Super Rare', 'EN', true, '2 tribute summon', 'Once per turn, when this card or a "Vampire" monster is Normal Summoned to your field: You can target 1 face-up monster your opponent controls, whose ATK is higher than this card''s; equip it to this card. This card gains ATK equal to the combined original ATK of the monsters equipped to it by this effect. If this card is sent to the GY, while equipped with a card(s) by this effect: Special Summon this card.', 2000, 2000, 7, 'Vampire Vamp', 'https://static.cardmarket.com/img/c50f89d12188a23d2cb06344ea285009/items/5/DASA/357263.jpg', null, 51, 151);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '003', 'Secret Rare', 'EN', true, '1 tribute summon', 'When a monster declares an attack: You can Special Summon this card from your hand in Defense Position. You can only use this effect of "Vampire Fraulein" once per turn. Once per battle, if your Zombie monster battles an opponent''s monster, during that damage calculation (Quick Effect): You can pay LP in multiples of 100 (max. 3000); your battling monster gains that much ATK/DEF during that damage calculation only. At the end of the Battle Phase, if this card destroyed any monster(s) by battle: You can Special Summon them from the GYs to your field.', 600, 2000, 5, 'Vampire Fraulein', 'https://static.cardmarket.com/img/a153ff4fbc74f47afac45d295acea51d/items/5/DASA/357216.jpg', null, 51, 151);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '024', 'Ultra Rare', 'EN', true, '1 tribute summon', 'If this card inflicts battle damage to your opponent: Declare 1 type of card (Monster, Spell, or Trap); your opponent sends 1 card of that type from their Deck to the GY. Once per turn, during your next Standby Phase after this card in your possession was destroyed and sent to your GY by an opponent''s card effect: Special Summon this card from the GY.', 2000, 1500, 5, 'Vampire Lord', 'https://static.cardmarket.com/img/e713e7752b8bb11c326fc39f8d49d95c/items/5/LCKC/319627.jpg', null, 401, 151);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id, bannedCard_id)
values(nextval('cardID_seq'), '029', 'Common', 'EN', true, null, 'Send 1 monster from your Deck to the GY.', null, null, null, 'Foolish Burial', 'https://static.cardmarket.com/img/79e3336f6a6257762b139de827a9292b/items/5/SDSH/438929.jpg', null, 501, 101, 1);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '091', 'Ultra Rare', 'EN', true, null, 'All monsters on the field and in the GYs become Zombie monsters. Neither player can Tribute Summon monsters, except Zombie monsters.', null, null, null, 'Zombie World', 'https://static.cardmarket.com/img/9274d1a282a820759dbbf43d35d14a4d/items/5/DUOV/442898.jpg', 'Field Spell', 551, 101);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '240', 'Common', 'EN', true, null, 'Activate 1 of these effects.\n●Target 1 face-up monster you control; send 1 "Vampire" monster from your Deck to the GY with a different Level from that monster, and if you do, the targeted monster becomes the Level of that sent monster in the GY, until the end of this turn.\n●Target 1 "Vampire" monster in your GY; send 1 monster you control to the GY, and if you do, Special Summon the targeted monster.\nYou can only activate 1 "Vampire''s Desire" per turn.', null, null, null, 'Vampire''s Desire', 'https://static.cardmarket.com/img/1b517dbe1aa1e0fd7d0de1411e5db34a/items/5/MP19/396172.jpg', null, 451, 101);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id)
values(nextval('cardID_seq'), '241', 'Common', 'EN', true, null, 'Once per turn: You can pay 500 LP; during your Main Phase this turn, you can Normal Summon 1 "Vampire" monster in addition to your Normal Summon/Set. (Even if this card leaves the field. You can only gain this effect once per turn.) Each time your "Vampire" monster inflicts battle damage to your opponent: Gain the same amount of LP.', null, null, null, 'Vampire''s Domain', 'https://static.cardmarket.com/img/e508538fd639235f570699b4546ac5f2/items/5/MP19/396177.jpg', 'Continuous', 451, 101);

insert into Card (id, printSet_card_id, rarity, langShort, firstEdition, summonType, description, atk, def, level, name, imageURL, icon, printSet_id, cardAttribute_id, bannedCard_id)
values(nextval('cardID_seq'), 'SE2', 'Super Rare', 'EN', true, null, 'Target 1 monster in your opponent''s GY; banish it, and if you do, until the end of the next turn, its effects are negated, as well as the activated effects and effects on the field of monsters with the same original name.', null, null, null, 'Called by the Grave', 'https://static.cardmarket.com/img/68ba1c39d3b9f06033448d16eedde776/items/5/EXFO/316254.jpg', 'Quick-Play', 651, 101, 51);

-- Deck

insert into Deck (id, name)
values (nextval('Deck_seq'), 'Vampire''s End');

-- DeckCard

insert into DeckCard(amount, card_id, deck_id)
values (3, 1, 1);

insert into DeckCard(amount, card_id, deck_id)
values (3, 51, 1);

insert into DeckCard(amount, card_id, deck_id)
values (3, 101, 1);

insert into DeckCard(amount, card_id, deck_id)
values (3, 151, 1);

insert into DeckCard(amount, card_id, deck_id)
values (2, 201, 1);

insert into DeckCard(amount, card_id, deck_id)
values (2, 251, 1);

insert into DeckCard(amount, card_id, deck_id)
values (2, 301, 1);

insert into DeckCard(amount, card_id, deck_id)
values (1, 351, 1);

insert into DeckCard(amount, card_id, deck_id)
values (2, 401, 1);

insert into DeckCard(amount, card_id, deck_id)
values (3, 451, 1);

insert into DeckCard(amount, card_id, deck_id)
values (3, 501, 1);

insert into DeckCard(amount, card_id, deck_id)
values (3, 551, 1);

insert into DeckCard(amount, card_id, deck_id)
values (3, 601, 1);

insert into DeckCard(amount, card_id, deck_id)
values (3, 651, 1);

insert into DeckCard(amount, card_id, deck_id)
values (2, 701, 1);

insert into DeckCard(amount, card_id, deck_id)
values (1, 751, 1);

insert into DeckCard(amount, card_id, deck_id)
values (2, 801, 1);

insert into DeckCard(amount, card_id, deck_id)
values (2, 851, 1);

insert into DeckCard(amount, card_id, deck_id)
values (1, 901, 1);

insert into DeckCard(amount, card_id, deck_id)
values (3, 951, 1);

insert into DeckCard(amount, card_id, deck_id)
values (2, 1001, 1);

insert into DeckCard(amount, card_id, deck_id)
values (3, 1051, 1);

insert into DeckCard(amount, card_id, deck_id)
values (1, 1101, 1);

-- deck_deckcard
insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 1);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 51);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 101);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 151);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 201);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 251);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 301);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 351);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 401);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 451);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 501);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 551);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 601);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 651);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 701);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 751);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 801);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 851);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 901);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 951);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 1001);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 1051);

insert into Deck_DeckCard (deck_id, cards_deck_id, cards_card_id)
values (1, 1, 1101);

-- card_cardtype

insert into card_cardtype(card_id, cardtype_id)
values(1, 1);

insert into card_cardtype(card_id, cardtype_id)
values(1, 51);

insert into card_cardtype(card_id, cardtype_id)
values(51, 1);

insert into card_cardtype(card_id, cardtype_id)
values(51, 51);

insert into card_cardtype(card_id, cardtype_id)
values(51, 101);

insert into card_cardtype(card_id, cardtype_id)
values(151, 1);

insert into card_cardtype(card_id, cardtype_id)
values(151, 51);

insert into card_cardtype(card_id, cardtype_id)
values(201, 1);

insert into card_cardtype(card_id, cardtype_id)
values(201, 51);

insert into card_cardtype(card_id, cardtype_id)
values(251, 1);

insert into card_cardtype(card_id, cardtype_id)
values(251, 51);

insert into card_cardtype(card_id, cardtype_id)
values(251, 101);

insert into card_cardtype(card_id, cardtype_id)
values(251, 101);

insert into card_cardtype(card_id, cardtype_id)
values(301, 1);

insert into card_cardtype(card_id, cardtype_id)
values(301, 51);

insert into card_cardtype(card_id, cardtype_id)
values(351, 1);

insert into card_cardtype(card_id, cardtype_id)
values(351, 51);

insert into card_cardtype(card_id, cardtype_id)
values(401, 1);

insert into card_cardtype(card_id, cardtype_id)
values(401, 51);

insert into card_cardtype(card_id, cardtype_id)
values(451, 1);

insert into card_cardtype(card_id, cardtype_id)
values(451, 51);

insert into card_cardtype(card_id, cardtype_id)
values(501, 1);

insert into card_cardtype(card_id, cardtype_id)
values(501, 51);

insert into card_cardtype(card_id, cardtype_id)
values(551, 1);

insert into card_cardtype(card_id, cardtype_id)
values(551, 51);

insert into card_cardtype(card_id, cardtype_id)
values(601, 1);

insert into card_cardtype(card_id, cardtype_id)
values(601, 51);

insert into card_cardtype(card_id, cardtype_id)
values(651, 1);

insert into card_cardtype(card_id, cardtype_id)
values(651, 51);

insert into card_cardtype(card_id, cardtype_id)
values(701, 1);

insert into card_cardtype(card_id, cardtype_id)
values(701, 51);

insert into card_cardtype(card_id, cardtype_id)
values(701, 101);

insert into card_cardtype(card_id, cardtype_id)
values(751, 1);

insert into card_cardtype(card_id, cardtype_id)
values(751, 51);

insert into card_cardtype(card_id, cardtype_id)
values(801, 1);

insert into card_cardtype(card_id, cardtype_id)
values(801, 51);

insert into card_cardtype(card_id, cardtype_id)
values(851, 1);

insert into card_cardtype(card_id, cardtype_id)
values(851, 51);