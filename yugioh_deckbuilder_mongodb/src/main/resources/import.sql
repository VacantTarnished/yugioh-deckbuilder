db.bannedcards.insertMany([{_id: nextval('BannedCard_seq'), name: "Foolish Burial", allowed_amount: 1},
{_id: nextval('BannedCard_seq'), name: "Called By the Grave", allowed_amount: 1}]);

db.printsets.insertMany([{_id: nextval('print_set_seq'), short_name: "MAMA", long_name: "Magnificent Mavens"},
{_id: nextval('print_set_seq'), short_name: "DASA", long_name: "Dark Saviors"},
{_id: nextval('print_set_seq'), short_name: "SR07", long_name: "Structure Deck: Zombie Horde"},
{_id: nextval('print_set_seq'), short_name: "GFTP", long_name: "Ghosts From the Past"},
{_id: nextval('print_set_seq'), short_name: "MP22", long_name: "2022 Tin of the Pharaoh''s Gods"},
{_id: nextval('print_set_seq'), short_name: "GFP2", long_name: "Ghosts From the Past: The 2nd Haunting"},
{_id: nextval('print_set_seq'), short_name: "DUSA", long_name: "Duellist Saga"},
{_id: nextval('print_set_seq'), short_name: "SESL", long_name: "Secret Slayers"},
{_id: nextval('print_set_seq'), short_name: "LCKC", long_name: "Legendary Collection Kaiba Mega Pack"},
{_id: nextval('print_set_seq'), short_name: "MP19", long_name: "2019 Gold Sarcophagus Tin Mega Pack"},
{_id: nextval('print_set_seq'), short_name: "SDSH", long_name: "Shaddoll Showdown"},
{_id: nextval('print_set_seq'), short_name: "DUOV", long_name: "Duel Overload"},
{_id: nextval('print_set_seq'), short_name: "SD2", long_name: "Zombie Madness"},
{_id: nextval('print_set_seq'), short_name: "EXFO", long_name: "Extreme Force"},
{_id: nextval('print_set_seq'), short_name: "BACH", long_name: "Battle of Chaos"}
]);

db.cardtypes.insertMany([
    {_id: nextval('CardAttribute_seq'), attribute: "Earth"},
    {_id: nextval('CardAttribute_seq'), attribute: "Effect"},
    {_id: nextval('CardAttribute_seq'), attribute: "Tuner"}
]);

db.cardattibutes.insertMany([
    {_id: nextval('CardAttribute_seq'), attribute: "Earth"},
    {_id: nextval('CardAttribute_seq'), attribute: "Trap"},
    {_id: nextval('CardAttribute_seq'), attribute: "Spell"},
    {_id: nextval('CardAttribute_seq'), attribute: "Dark"},
    {_id: nextval('CardAttribute_seq'), attribute: "Fire"}
]);

db.cards.insertMany([
    {_id: nextval('cardID_seq'), printsets_card_id: '050', rarity: "Ultra Rare", lang_short: "EN", first_edition: true, summon_type: "normal summon", description: 'You can banish this card from your GY, then target 1 Zombie monster in your GY; Special Summon that target.', atk: 1700, def: 800, level: 4, name: "Mezuki", image_url: "https://static.cardmarket.com/img/9d5cdc2d3088cd95d787598e1a735f86/items/5/MAMA/681075.jpg", icon: null, printsets_id: 1, cardattibutes_id: 1},
    {_id: nextval('cardID_seq'), printsets_card_id: '257', rarity: "Secret Rare", lang_short: "EN", first_edition: true, summon_type: "normal summon", description: 'When a card or effect is activated that includes any of these effects (Quick Effect): You can discard this card; negate that effect.\n●Add a card from the Deck to the hand.\n●Special Summon from the Deck.\n●Send a card from the Deck to the GY.\nYou can only use this effect of "Ash Blossom & Joyous Spring" once per turn.', atk: 0, def: 1800, level: 2, name: "Ash Blossom & Joyous Spring", image_url: "https://static.cardmarket.com/img/daeac6c3348c396ba6d8f098dae33fd9/items/5/MP22/673759.jpg", icon: null, printsets_id: 201, cardattibutes_id: 201},
    {_id: nextval('cardID_seq'), printsets_card_id: '172', rarity: "Ultra Rare", lang_short: "EN", first_edition: true, summon_type: "set", description: 'When a Spell/Trap Card, or monster effect, is activated while you control a "Vampire" monster: Negate the activation, and if you do, destroy that card, then, if it was a Monster Card, gain LP equal to its original ATK. You can only activate 1 "Vampire Domination" per turn.', atk: null, def: null, level: null, name: "Vampire Domination", image_url: 'https://static.cardmarket.com/img/c32c4366e50ce3df3e4521f6162afa9e/items/5/GFP2/652754.jpg', icon: "Counter", printsets_id: 301, cardattibutes_id: 51},
    {_id: nextval('cardID_seq'), printsets_card_id: '002', rarity: "Super Rare", lang_short: "EN", first_edition: true, summon_type: "normal summon", description: 'If this card is Special Summoned: You can pay 500 LP; add 1 "Vampire" Spell/Trap from your Deck to your hand. If this card is in your GY: You can send 1 "Vampire" card from your hand or face-up field to the GY; Special Summon this card, but banish it when it leaves the field. You can only use each effect of "Vampire Retainer" once per turn.', atk:1200, def: 0, level: 2, name: "Vampire Retainer", image_url: "https://static.cardmarket.com/img/7c678923a76439ab3781638665ec7cba/items/5/DASA/357215.jpg", icon: null, printsets_id: 51, cardattibutes_id: 151},
    {_id: nextval('cardID_seq'), printsets_card_id: '070', rarity: "Ultra Rare", lang_short: "EN", first_edition: true, summon_type: "normal summon", description: "If this card in your possession is sent to your Graveyard by your opponent''s card (either by battle or by card effect): You can add 1 DARK 'Vampire' monster or 1 'Vampire' Spell/Trap Card from your Deck to your hand. You can banish this card from your Graveyard; 1 DARK 'Vampire' monster you Normal Summon this turn can be Summoned without Tributing.", atk: 1500, def: 1500, level: 4, name: "Vampire Sorcerer", image_url: "https://static.cardmarket.com/img/08823eda464b55c73a84c1cc1cd74800/items/5/GFP2/652653.jpg", icon: null, printsets_id: 301, cardattibutes_id: 151}
])